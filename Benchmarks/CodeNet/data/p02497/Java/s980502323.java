import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int m,n,r;
			m = sc.nextInt();
		    n = sc.nextInt();
			r = sc.nextInt();
			if(m == -1 && m == -1 && r ==-1) break;
			if(m == 0 ||n == 0){
				System.out.print("F");
			}else if(80<=m+n && r==-1){
				System.out.print("A");
			}else if(65 <= m+n && m+n < 80 && r==-1){
				System.out.print("B");
			}else if(50 <= m+n && m+n < 65 && r==-1){
				System.out.print("C");
			}else if(30 <= m+n && m+n < 50){
				if(r < 50){
					System.out.print("D");
				}else{
					System.out.print("C");
				}
			}else{
				System.out.print("F");
			}
			System.out.println();
		}
	}
}