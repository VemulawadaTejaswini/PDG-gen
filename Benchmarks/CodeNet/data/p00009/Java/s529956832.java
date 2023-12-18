import java.io.*;
import java.util.*;

    public class Main {
    public static void main(String[] args)
    throws java.io.IOException{
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            int count=1;
            int n = scan.nextInt();
            boolean [] prime = new boolean [n+1];
            for(bool b :prime) 
                b = true;

            for(int i=0;i<=n;i++){
                if(prime[i]){
                    count++;
                    int p =2 *i +3;
                    for(int k=i+p;k<+n;k+=p)prime[k]=false;
                }
            }
            System.out.println(count);
        }   
    }
~      