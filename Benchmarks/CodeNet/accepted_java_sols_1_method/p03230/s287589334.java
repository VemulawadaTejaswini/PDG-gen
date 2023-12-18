import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int k=0;
		while(k*(k-1)/2 <n)++k;

		if(k*(k-1)/2 !=n){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
			System.out.println(k);
			int matrix[][]=new int[k][k];
			int i=1;
			for(int a=0;a<k;++a){
				for(int b=0;b<k;++b){
					if(a>b)matrix[a][b]=matrix[b][a];
					else if(a==b);
					else {matrix[a][b]=i; ++i;}
				}
				System.out.print((k-1)+" ");
				for(int b=0;b<k;++b){
					if(a!=b){
						System.out.print(matrix[a][b]);
						if(b!=k-1)System.out.print(" ");
						else System.out.println();
					}
				}
			}



		}
	}
}