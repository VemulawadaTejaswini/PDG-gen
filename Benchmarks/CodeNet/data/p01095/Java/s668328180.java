import java.util.Scanner;

public class Main {public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				boolean[] v=new boolean[8000000];
				int m=sc.nextInt();
				int n=sc.nextInt();
				int pos=m;
				if(m+n==0) {
					break;
				}
				for(int i=0; i<n; i++) {
					while(v[pos]) {
						pos++;
					}
					for(int j=pos;j<=7368791; j=j+pos) {
						v[j]=true;
					}
				}
				while(v[pos]) {
					pos++;
				}
				System.out.println(pos);
			}
			
		}
	}
}

