import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String p = br.readLine();
        String ans = null;
        
        for(int i = 0; i<p.length();i++){
            for(int j = 0; j<s.length();j++){
                if(p.charAt(i)==s.charAt(j)){
                    ans="Yes";
                   break;
                }else{
                    ans="No";
                }
            }
        }
      
            System.out.println(ans);
        
    }
}