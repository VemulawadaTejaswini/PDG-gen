import java.util.*;
import java.io.*;
 
public class Main{
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int K = s.nextInt();
        int A = s.nextInt();
        int B = s.nextInt();
        boolean S = false;

        for(int i = A; i <= B; i++){
            if(i % K == 0){
                S = true;
            }
        }

        

        if(S){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
	}
} 