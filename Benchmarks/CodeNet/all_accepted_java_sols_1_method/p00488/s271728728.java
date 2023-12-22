import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ps[] = new int [3];
		int dr[] = new int [2];
		int p,d;
		p=2001;
		for(int i=0;i<3;i++){
			ps[i]=sc.nextInt();
			if(p>ps[i]){
				p=ps[i];
			}
		}
		d=2001;
		for(int i=0 ; i<2 ; i++){
			dr[i] = sc.nextInt();
			if(d>dr[i]){
				d=dr[i];
			}
		}
		System.out.println(p+d-50);
	}
}