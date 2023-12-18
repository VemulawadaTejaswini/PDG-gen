import java.util.*;
import java.io.*;
 
public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long sum = 1;
        for(int i = 0; i < n; i++){
            sum *= sc.nextLong();
        }
        if(sum > (long) Math.pow(10, 18)){
            sum = -1;
        }
        System.out.println(sum);
    }
}