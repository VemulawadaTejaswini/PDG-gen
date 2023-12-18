import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        long idx=Integer.parseInt(buf.readLine()); 
        int ans=0;
        for(int i=0; i<idx;i++){
           long x=Integer.parseInt(buf.readLine());
           if(Prime(x)) ans++;
        }
        System.out.println(ans);
    }
    static boolean Prime(long x){
    for(int i=2;i<x;i++){
        if(x<2){
            return false;
        }else if(x==2){
            return true;
                }else if(x%2==0){
                return false;
                }else if(x%i==0){
                    return false;
                }
        }
    return true;
    }
}