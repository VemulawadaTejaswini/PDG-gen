import java.util.Scanner;

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		int n=sc.nextInt();
		int R[];
		R=new int[n];

		for(int i=0;i<n;i++) 
			R[i]=sc.nextInt();

		int max=R[1]-R[0];
		int min=R[0];

		for(int i=0;i<n;i++) {
			if(R[i]<min) min=R[i];
			for(int j=i+1;j<n;j++)
				if (min<R[i]) break;
				else if(R[j]-R[i]>max)
					max=R[j]-R[i];
		}

		System.out.println(max);

	}

}
