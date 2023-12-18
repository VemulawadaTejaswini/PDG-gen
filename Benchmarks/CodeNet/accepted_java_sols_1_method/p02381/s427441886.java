import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = Integer.parseInt(sc.nextLine());
			double nDouble =(double)n;
			if(n==0){
				break;
			}
			String[] line= sc.nextLine().split(" ");
			double[] s = new double[n];
			double m=0;
			double sum=0;
			double alpha=0;
			for(int i=0;i<n;i++){
				s[i]=Double.parseDouble(line[i]);
				sum+=s[i];
			}
			m=sum/nDouble;
			sum=0;
			for(int i=0;i<n;i++){
				sum+=(s[i]-m)*(s[i]-m);
			}
			alpha=Math.sqrt(sum/n);
			System.out.printf("%.5f",alpha);
			System.out.println();
		}
	}
}