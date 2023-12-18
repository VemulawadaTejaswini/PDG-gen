import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] ia; 

        int N = Integer.parseInt(in.readLine());
        for(int n = 0;n < N; ++n){
            ia = in.readLine().split(" ");
            int Y = Integer.parseInt(ia[0]);
            int M = Integer.parseInt(ia[1]);
            int D = Integer.parseInt(ia[2]);
            int days = 0;
            for(int d = D;d < 20; ++d){
                ++days;
            }   
            if(Y % 3 == 0 || M % 2 == 1){ 
                ++days;
            }   
            for(int m = M+1;m <= 10; ++m){
                if(Y % 3 == 0 || m % 2 == 1){ 
                    days += 20; 
                } else {
                    days += 19; 
                }   
            }   
            for(int y = Y+1;y < 1000; ++y){
                if(y % 3 == 0){ 
                    days += 10 * 20; 
                } else {
                    days += 5 * 20 + 5 * 19; 
                }   
            }   
            System.out.println(days);
        }   
    }   
}