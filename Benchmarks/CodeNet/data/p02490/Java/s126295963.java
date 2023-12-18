import java.io.*;
 
public class Main {
    public static void main(String[] args)throws IOException{
        int a,b,i;
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        while(true){
            String s = br.readLine();
            String[] st = s.split(" ");
            a = Integer.parseInt(st[0]);
            b = Integer.parseInt(st[1]);
            if(a==0 && b==0) break;
            if(a<b){
                System.out.println(a+" "+b);
            }else{
                System.out.println(b+" "+a);
            }
        }
    }
}