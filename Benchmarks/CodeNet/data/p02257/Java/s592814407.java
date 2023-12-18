import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int idx=Integer.parseInt(buf.readLine()); 
        int ans=0;
        for(int i=0; i<idx;i++){
           int x=Integer.parseInt(buf.readLine());
           if(Prime(x)) ans++;
        }
        System.out.println(ans);
    }
    static boolean Prime(int x){
            if(x<2) return false;
            if(x==2) return true;
            else if(x%2==0) return false;
    for(int i=3;i<x;i+=2){
        if(x%i==0) return false;
        }
        return true;
    }   
}