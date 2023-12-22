import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = 0;

		int l[] = new int[n*2];

		for (int i=0; i < n*2; i++){
			l[i] = sc.nextInt();
		}

		java.util.Arrays.sort(l);

		for (int i=0; i<n*2; i=i+2){
			if(l[i] < l[i+1]){
				ans += l[i];
			}else{
				ans += l[i+1];
			}
		}

		System.out.println(ans);
		sc.close();
	}

}