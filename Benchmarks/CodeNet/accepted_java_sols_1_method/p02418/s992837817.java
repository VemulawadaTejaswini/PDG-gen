import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String p = br.readLine();
        String ans=null;
        String res=null;
        for(int i=0;i<s.length();i++){
            if(i+p.length() <=s.length()){
                ans=s.substring(i, i+p.length());
            }else{
                ans=s.substring(i , s.length())+s.substring(0 , p.length()-(s.length()-i));
            }
            if(p.equals(ans)){
                res="Yes";
                break;
            }
                    
        }
        if(res=="Yes"){
            System.out.println(res);
        }else{
            System.out.println("No");
        }
 
        
    }

        
}