import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x[]=new int[10000];
		int n=stdIn.nextInt();
		for(int i=0;i<n;i++) x[i]=stdIn.nextInt();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(x[i]<x[j]){
					int tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
			}
		}
		for(int i=0;i<n;i++){
			if(i!=n-1)System.out.print(x[i]+" ");
			else System.out.println(x[i]);
		}
	}
}