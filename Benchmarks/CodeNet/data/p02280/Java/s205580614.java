import java.io.*;
import java.util.*;

//height 違う
public class Main{
    static int count =0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
     
        str = br.readLine();
        int n = Integer.parseInt(str);

        Nodes[] line = new Nodes[n];
        for(int i=0;i<n;i++){
            line[i] = new Nodes();
            str = br.readLine();
            String[] tmp = str.split("\\s");
            line[i].N = Integer.parseInt(tmp[0]);
            line[i].DL = Integer.parseInt(tmp[1]);
            line[i].DR = Integer.parseInt(tmp[2]);
            if(line[i].DL == -1 && line[i].DR == -1){
                line[i].Deg = 0;
            }else{
                line[i].Deg =2;
                line[i].Type = "internal node";//一時書き換え（rootは後で探す）
            }
        }

        int NP = 0;
        for(int i=0;i<n;i++){
            int num = 0;
            for(int j=0;j<n;j++){
                if(i != j){
                    if(line[i].N == line[j].DL || line[i].N == line[j].DR){
                        line[i].P = line[j].N;
                        num++;
                    }
                }
            }
            if(num ==0){
                line[i].Type = "root";
                NP = i;
            }
        }
//node,parent,degree,type OK, rest:sibling,depth,height

        //cal depth
        int MaxH =0;
        for(int i=0;i<n;i++){
            line[i].Dep = FindD(line,line[i].P,0);
            if(MaxH < line[i].Dep){
                MaxH = line[i].Dep;
            }
        }

        //修正する
        for(int i=0;i<n;i++){
            if(line[i].Type.equals("leaf")){
                FindH(line,i,0);
            }
        }
        
        line[NP].H = MaxH;
        
        //from here sibling
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i != j){
                    if(line[i].P ==line[j].P && line[i].Dep == line[j].Dep){
                        line[i].S = line[j].N;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append("node ");
            sb.append(line[i].N);
            sb.append(": parent = ");
            sb.append(line[i].P);
            sb.append(", sibling = ");
            sb.append(line[i].S);
            sb.append(", degree = ");
            sb.append(line[i].Deg);
            sb.append(", depth = ");
            sb.append(line[i].Dep);
            sb.append(", height = ");
            sb.append(line[i].H);
            sb.append(", ");
            sb.append(line[i].Type);
            if(i != n-1){
            sb.append("\n");
            }
        }
        System.out.print(sb.toString());

    }
    public static int FindD(Nodes[] line,int P,int depth){//depth = 0で入力
        if(P != -1){
            depth++;
            depth = FindD(line,line[P].P,depth);
        }
        return depth;
    }

    //修正する。
    public static void FindH(Nodes[] line,int i,int Hei){
       //leaf comes first
       if(!(line[i].Type.equals("root"))){
        if(line[i].H < Hei){
            line[i].H = Hei;
            Hei++;
            FindH(line,line[i].P,Hei);
        }
       }
    }

}

class Nodes{
    int N;//node
    int P;//親ノード
    int S;//sibling
    int DL;//left child
    int DR;//右の子
    int Deg;
    int Dep;//depth
    int H;//height
    String Type;//root,internal node,leaf
    Nodes(){
        this.N = -1;
        this.P = -1;
        this.S = -1;
        this.DL = -2;
        this.DR = -2;
        this.Deg = -2;
        this.Dep = 0;
        this.H = -1;
        this.Type = "leaf";
    }
}
