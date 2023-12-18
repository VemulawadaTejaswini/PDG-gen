import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int K = sc.nextInt();
        
        if(A>=B && A>=C){
        	int A_mult = A;
        	for(int k=0;k<K;k++) A_mult *= 2;
        	System.out.println(A_mult+B+C);
        }else if(B>=C){
        	int B_mult = B;
        	for(int k=0;k<K;k++) B_mult *= 2;
        	System.out.println(A+B_mult+C);
        }else{
        	int C_mult = C;
        	for(int k=0;k<K;k++) C_mult *= 2;
        	System.out.println(A+B+C_mult);
        }
    }
}