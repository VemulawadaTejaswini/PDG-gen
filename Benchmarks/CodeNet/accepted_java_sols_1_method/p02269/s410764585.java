import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> hs = new HashSet<String>();
        StringBuilder sb = new StringBuilder();
        
        try{
            int n = Integer.parseInt(br.readLine());

            String[] str = new String[2];
            for(int i = 0; i < n; i++){
                str = br.readLine().split(" ");
                if(str[0].equals("insert")){
                    hs.add(str[1]);
                }else if(str[0].equals("find")){
                    if(hs.contains(str[1])){
                        sb.append("yes\n");
                    }else{
                        sb.append("no\n");
                    }
                }
            }

            System.out.print(sb.toString());
        }catch(IOException e){
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
