import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("");
		
		Scanner n=new Scanner(System.in);
		
		int a=n.nextInt();
		int b=n.nextInt();
		
		while (a!=0 || b!=0){
			for (int c=0;c<a;c++){
				for (int d=0;d<b;d++){
					sb.append("#");
				}
				sb.append("\n");
				
			}
			System.out.println(sb);
			a=n.nextInt();
			b=n.nextInt();
			sb=new StringBuilder("");
		}
	}
}