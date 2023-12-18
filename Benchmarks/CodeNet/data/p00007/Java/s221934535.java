import java.io.*;
import java.util.*;
class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long debt=100000;
        for(int i=1;i<=n;i++){
            debt+=(debt/20);
            if(debt%1000!=0){
                debt-=debt%1000;
                debt+=1000;
            }
        }System.out.println(debt);
    }
    
}