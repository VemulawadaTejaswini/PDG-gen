import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data[] = new int[n];
		for(int i = 0;i < n;i++) data[i] = sc.nextInt();
		int min , max,ans;
		min = max =data[0];
		for(int i = 1;i < n;i++) {
			if(max < data[i])max = data[i];
			if(min > data[i])min = data[i];
		}
		ans = max - min;
		System.out.println(ans);
	}

}
