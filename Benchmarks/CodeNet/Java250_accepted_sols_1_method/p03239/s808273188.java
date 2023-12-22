import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] c = new int[1000];
		int[] t2 = new int[1000];
		int n = sc.nextInt();
		int t1 = sc.nextInt();
		int count = 1001;
		int answer = 0;
		int i;
		for(i = 0;i < n; i++){
			c[i] = sc.nextInt();
			t2[i] = sc.nextInt();


			if((t2[i] <= t1) && (c[i] < count)){
				answer  = i;
				count = c[i];
			}

		}
		if(count == 1001){
			System.out.println("TLE");
		}else{
			System.out.println(count);
		}
		
	}
}
