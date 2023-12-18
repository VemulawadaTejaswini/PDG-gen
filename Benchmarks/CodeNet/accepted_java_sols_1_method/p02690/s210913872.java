import java.util.*;
import java.io.*;
 
public class Main{
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        long X = s.nextLong();
        List<Integer> factor = new ArrayList<Integer>();

        long A = 0;
        long B = 0;
        boolean check = false;
        for(int i = -130; i <=130; i++){
            for(int j = -130; j <=130; j++){
                A = i; B = j;
                if(X == A*A*A*A*A - B*B*B*B*B){
                    check = true;
                    break;
                }
            }
            if(check) break;
        }
        
        System.out.println(A + " " + B);
        
        
	}
} 