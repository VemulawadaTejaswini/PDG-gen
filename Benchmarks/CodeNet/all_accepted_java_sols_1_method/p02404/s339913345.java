import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("");
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		int b=n.nextInt();
		while (a!=0 || b!=0){
			for (int c=0;c<b;c++){
					sb.append("#");
			}
			System.out.println(sb);
			sb.append("\n");//改行
			sb=new StringBuilder("#");
			for (int d=2;d<a;d++){
				for (int e=2;e<b;e++){
					sb.append(".");
				}
				sb.append("#");
				System.out.println(sb);
				sb.append("\n");//改行
				sb=new StringBuilder("#");
			}
			for (int c=1;c<b;c++){
				sb.append("#");
			}
		sb.append("\n");//改行
		System.out.println(sb);
		a=n.nextInt();b=n.nextInt();
		sb=new StringBuilder("");
		}
	}
}