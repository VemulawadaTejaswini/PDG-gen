import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int res = X;
        for (int i = 0; i < N; i ++) {
            res += (D-1) / sc.nextInt() + 1;     
        }

        System.out.println(res);
    }

}