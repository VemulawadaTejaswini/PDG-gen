import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

			if(a <b) {
				if(b<c) {
					K(c,a,b,k);
				}else {
					K(b,a,c,k);
				}
			}else {
				if(c<a) {
					K(a,b,c,k);
				}else {
					K(c,a,b,k);
				}
			}
	}
	public static void K(int x,int y,int z,int k) {
		for(int j = 0; j<k ;j++) {
			x +=x;
		}
		System.out.println(x+y+z);
	}
}
