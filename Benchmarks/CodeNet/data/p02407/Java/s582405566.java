import java.util.Scanner;
	class Main{

		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	int k;
	k=sc.nextInt();
	int d[]=new int[k];
	for(int i=0;i<k;i++){
		d[i]=sc.nextInt();
	}
	for(int i=k-1;0<=i;i--){
		
		System.out.print(d[i]+" ");
	}
	
	
	}
	}