import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int[] ans={};
        
        while(true){
            String str=buf.readLine();
            if(str.length()==1 && str.charAt(0)=='0'){break;}
            
            int sum=0;
            for(int i=0;i<str.length();i++){
                sum +=str.charAt(i)-'0';
            }
            System.out.println(sum);
        }
    }            
}