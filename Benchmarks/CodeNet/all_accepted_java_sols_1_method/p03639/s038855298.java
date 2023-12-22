import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count1 = 0, count2 = 0, count4 = 0;
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if(a % 4 == 0)
				count4++;
			else if(a % 2 == 0)
				count2++;
			else
				count1++;
		}
		if(count2 == 0)
			count4++;
		System.out.println(count4 >= count1 ? "Yes" : "No");
	}

}