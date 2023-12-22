import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] result=new int[n];
		for(int i=1;sc.hasNextInt();i++) {
			result[sc.nextInt()-1]=i;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(result[i]);
			if(i!=n) {
				sb.append(" ");
			}else {
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}