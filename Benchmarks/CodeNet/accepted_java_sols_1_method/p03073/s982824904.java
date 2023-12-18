import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String[] SS = S.split("",S.length());
		int[] N = new int[SS.length];

		for(int i=0;i<S.length();i++){
			N[i] = Integer.parseInt(SS[i]);
		}
		int ans = 0;

		for(int j =0;j<N.length-1;j++){
			if(N.length==1)break;
			if(N[j]==N[j+1]&&N[j+1]==1){
				N[j+1] = 0;
				ans++;
			}else if(N[j]==N[j+1]&&N[j+1]==0){
				N[j+1] = 1;
				ans++;
			}
		}
		System.out.println(ans);
	}
}