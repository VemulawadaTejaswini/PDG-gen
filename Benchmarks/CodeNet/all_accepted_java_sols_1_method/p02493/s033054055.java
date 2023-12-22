import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x[]=new int[10000];
		int n=stdIn.nextInt();
		for(int i=0;i<n;i++) x[i]=stdIn.nextInt();
		for(int i=0;i<n/2;i++){
					int tmp=x[i];
					x[i]=x[n-i-1];
					x[n-i-1]=tmp;
		}
		for(int i=0;i<n;i++){
			if(i!=n-1)System.out.print(x[i]+" ");
			else System.out.println(x[i]);
		}
	}
}