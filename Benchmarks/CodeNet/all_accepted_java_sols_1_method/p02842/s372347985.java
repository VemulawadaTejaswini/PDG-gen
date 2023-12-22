import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = (int) (N / (1.08));
		if (((int) ((ans - 1) * 1.08) == N)){
			System.out.println(ans - 1);
		}else if ((int) ((ans + 1) * 1.08) == N){
			System.out.println(ans + 1);
		}else if ((int) (ans * 1.08) == N){
			System.out.println(ans);
		}else{
			System.out.println(":(");
	    }
    }
}