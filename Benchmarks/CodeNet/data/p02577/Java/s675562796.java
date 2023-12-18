import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
	int ans=0;
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        if(sumDigits(N)%9==0){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
    public static int sumDigits(int n){
	int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
    }
}
