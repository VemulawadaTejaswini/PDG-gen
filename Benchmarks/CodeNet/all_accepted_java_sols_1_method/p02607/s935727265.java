import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int count = 0;
		for(int i = 0;i < N;i++) {
			int x = sc.nextInt();
			a[i] += x;
		}
		for(int j = 0;j < N;j = j + 2) {
			if(a[j] % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);
  }
}