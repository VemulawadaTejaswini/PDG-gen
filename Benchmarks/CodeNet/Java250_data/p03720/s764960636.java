import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),m=scan.nextInt(),a,b,t[]=new int[50],i;
		for(i=0;i<m;i++) {
			a=scan.nextInt();
			b=scan.nextInt();
			t[a-1]++;
			t[b-1]++;
		}
		scan.close();
		for(i=0;i<n;i++) System.out.println(t[i]);
	}
}