import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ArrayList<int[]> list = new ArrayList<>();
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), D = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int[] mlist = new int[D];
			for(int j = 0; j < D; j++) {
				mlist[j] = sc.nextInt();
			}
			list.add(mlist);
		}
		
		for(int i = 0; i < N-1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(dis(list.get(i),list.get(j))) ans++;
			}
		}
		System.out.println(ans);
		
	}
	
	public static boolean dis(int[] list1, int[] list2) {
		int sum = 0;
		for(int i = 0; i< list1.length; i++) {
			sum += Math.pow((list1[i]-list2[i]),2);
		}
		if((Math.sqrt(sum) * 10)%10 == 0)  return true;
		else return false;
	}
}