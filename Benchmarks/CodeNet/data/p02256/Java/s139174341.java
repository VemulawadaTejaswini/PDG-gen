import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
                    
        str = br.readLine();
        String[] line = str.split("\\s");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);
        ArrayList<Integer> XD = new ArrayList<Integer>();
        ArrayList<Integer> YD = new ArrayList<Integer>();

        for(int i = 2;i <= x;i++){
            if(x % i == 0){
                XD.add(i);
            }
        }

        for(int i = 2;i <= y;i++){
            if( y % i == 0){
                YD.add(i);
            }
        }

        int ans = 1;
        for(int i = 0;i < XD.size();i++){
            for(int j=0;j < YD.size();j++){
                if(XD.get(i) == YD.get(j))
                    ans = XD.get(i);
            }
        }
        System.out.println(ans);
       
        br.close();
    }
}
