import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int member = in.nextInt();
		int cAve = in.nextInt();
		int[] a = new int [member];
		int[] b = new int [cAve];
		int[] c = new int [member];
		for(int i = 0;i < member;i++){
			a[i] = in.nextInt();
			c[i] = 0;
		}
		for(int i = 0;i < cAve;i++){
			b[i] = in.nextInt();
		}
		for(int i = 0;i < cAve;i++){
			for(int j = 0;j < member;j++){
				if(a[j] <= b[i]){
					c[j]++;
					break;
				}
			}
		}
		int max = 1;
		for(int i = 0;i < member;i++){
			if(c[max-1] < c[i]){
				max = i+1;
			}
		}
		System.out.println(max);
	}
}