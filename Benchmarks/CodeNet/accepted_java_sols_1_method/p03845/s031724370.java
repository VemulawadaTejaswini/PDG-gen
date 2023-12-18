import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),t[]=new int[100],m,p,x,i,j,s;
		for(i=0;i<n;i++) t[i]=stdIn.nextInt();
		m=stdIn.nextInt();
		for(i=0;i<m;i++) {
			p=stdIn.nextInt();
			x=stdIn.nextInt();
			s=0;
			for(j=0;j<n;j++) {
				if(j==p-1) s+=x;
				else s+=t[j];
			}
			System.out.println(s);
		}
	}
}