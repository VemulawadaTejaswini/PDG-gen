import java.io.*;
import java.util.*;


public class Main{
    static int count =0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
     
        str = br.readLine();
        int n = Integer.parseInt(str);

        Nodes[] line = new Nodes[n];
        
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            line[i] = new Nodes();
            str = br.readLine();
            String[] tmp = str.split("\\s");
            int[] row = new int[tmp.length];
            for(int j=0;j<tmp.length;j++){
                row[j] = Integer.parseInt(tmp[j]);
            }
            
            line[i].ID=row[0];

            if(line[i].ID==0){
                line[i].D = 0;
            }
            
            if(row[0] == 0){
                line[i].P = -1;
            }else{
                //serch parent ※何かミスったっぽい
                //define Depth
                for(int l=i-1;l>=0;l--){
                    if(line[l].Ck != null){
                        for(int m =0;m<line[l].Ck.length;m++){
                            if(line[i].ID == line[l].Ck[m]){
                                line[i].P = line[l].ID;
                                line[i].D = line[l].D +1;
                            }
                        }
                    }
                }
            }

            if(row[1] == 0){
                line[i].Type = "leaf";
            }else if(line[i].ID == 0){
                line[i].Type = "root";
                line[i].Ck = new int[row[1]];
                for(int k=0;k<row[1];k++){
                    line[i].Ck[k] = row[2+k];
                }
            }else{
                line[i].Type = "internal node";
                line[i].Ck = new int[row[1]];
                for(int k=0;k<row[1];k++){
                    line[i].Ck[k] = row[2+k];
                }
            }
        
            ans.append("node ");
            ans.append(line[i].ID);
            ans.append(": parent = ");
            ans.append(line[i].P);
            ans.append(", depth = ");
            ans.append(line[i].D);
            ans.append(", ");
            ans.append(line[i].Type);
            ans.append(", [");
            if(line[i].Ck != null){
                for(int j=0;j<line[i].Ck.length;j++){
                    ans.append(line[i].Ck[j]);
                    if(j != line[i].Ck.length-1){
                        ans.append(",");
                    }else{
                        ans.append("]");
                        ans.append("\n");
                    }
                }
            }else{
                ans.append("]");
                ans.append("\n");
            }
        }
        System.out.print(ans.toString());
    }
}

class Nodes{
    int ID;
    int P;
    int D;
    String Type;
    int[] Ck;
}
