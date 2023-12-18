import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			int b = 0;
			int c = 0;
			for(int j=0; j<10; j++){
				int read = sc.nextInt();
				if( (b>c ? b : c) < read ){
					if(b > c) b = read;
					else c = read;
				}
				else if(b < read && c > read) b=read;
				else if(c < read && b < read) c=read;
				else { System.out.println("NO"); break; }
				if(j==9) System.out.println("YES");
			}
		}
	}
}