import java.util.Scanner;
public class Main {

    public static void main(String[] args){

    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int D = sc.nextInt();
    	int A = D + 1 + D;
    	int ans = N / A;

    	if (N % A > 0){
    		ans++;
    	}

    	System.out.println(ans);
    }
}