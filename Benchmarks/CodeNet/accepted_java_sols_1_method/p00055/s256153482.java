import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double s,n,k[]=new double[11];
		int i;
		while(sc.hasNext()){
			n=sc.nextDouble();
			s=0;
			k[0]=0;
			k[1]=n;//
			for(i=2;i<11;i++){
				if(i%2==0){
					k[i]=k[i-1]*2;
				}
				else{
					k[i]=k[i-1]/3.0;
				}
			}//for
			for(i=1;i<11;i++){
				s+=k[i];
			}
			System.out.printf("%.8f\n",s);
		}
	}
}