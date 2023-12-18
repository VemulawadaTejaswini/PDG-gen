import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		while(true){
			int n=sc.nextInt();
			int p=sc.nextInt();
			if(n==0) break;

			int i=0;
			int[] a=new int[n];
			while(true){
				if(p>0){ p--; a[i]++; }
				else{ p+=a[i]; a[i]=0; }

				if(p==0){
					boolean end=true;
					for(int j=0;j<n;j++) if(i!=j && a[j]!=0) end=false;
					if(end) break;
				}

				i=(i+1)%n;
			}
			System.out.println(i);
		}

		return;
	}
}