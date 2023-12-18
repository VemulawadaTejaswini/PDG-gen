import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ans = new int[201];
		int i=0;
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			ans[i] = Integer.toString(a+b).length();
			i++;
		}
		i=0;
		while(ans[i]!=0){
			System.out.println(ans[i]);
			i++;
		}
	}
}