import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),m=scan.nextInt(),x=scan.nextInt(),a,l=0,r=0,i;
		for(i=0;i<m;i++) {
			a=scan.nextInt();
			if(a>x) r++;
			else l++;
		}
		scan.close();
		System.out.print(r>l?l:r);
	}
}