import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String[] str=br.readLine().split(" ");
         int a=Integer.parseInt(str[0]);
         int b=Integer.parseInt(str[1]);
         int c=Integer.parseInt(str[2]);
        if((a+b)==c){
              System.out.println("Yes");
        }else if((b+c)==a){
              System.out.println("Yes");
        }else if((c+a)==b){
              System.out.println("Yes");
        }else{
              System.out.println("No");
        }
    }
}