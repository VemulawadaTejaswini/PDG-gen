import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	long ans = 1;
        for(int i=0;i<N;i++){
	    ans = ans * sc.nextLong();
	}
	        
	if(ans / Math.pow(10,18) >= 1)
	    ans = -1;
	System.out.print(ans);
    }
}
