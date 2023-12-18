import java.util.Scanner;



public class Main{

public static void main(String[] args){

	int x[]=new int[1000],temp,i,j,n;

	Scanner sc = new Scanner(System.in);



	n=sc.nextInt();
	for(i=0;i<n;i++){

		x[i]=sc.nextInt();
	}

	for(i=0;i<n-1;i++){

		for(j=n-1;j>i;j--){

			if(x[j-1]>x[j]){

				temp=x[j];

				x[j]=x[j-1];

				x[j-1]=temp;

			}

		}

	}
	for(i=0;i<n;i++){

		System.out.printf("%d ",x[i]);
	}
	System.out.printf("\n");



}

}