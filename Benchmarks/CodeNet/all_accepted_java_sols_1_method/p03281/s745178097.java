import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        if(N%2==0){
            N=N-1;   
        }
        for (int i=N ; i > 0 ; i=i-2){
            int count = 0;
            for (int j=1 ; j <= N ; j=j+2){
                if(i%j==0){
                    count = count + 1;
                }
            }
            if(count==8){
                total = total + 1;
            }
        }
        System.out.println(total);
    }
}