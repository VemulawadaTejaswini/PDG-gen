import java.util.Scanner;

public class Main {
	public static <S> void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		int[] S;
		S=new int[1000];
		double sum,m,k,a;
		
		
		while(n!=0){
			sum=0.0;
			for (int i=0;i<n;i++){
				S[i]=input.nextInt();
			}
			for (int i=0;i<n;i++){
				sum=sum+S[i];
	
			}
		
			m=sum/n;
			k=0.0;
			double u=0.0;
			
			for (int i=0;i<n;i++){
				k=(S[i]-m)*(S[i]-m);
				u=u+k;
			}
			
			a=u/n;
			System.out.println(Math.sqrt(a));
			
		}

	}
}