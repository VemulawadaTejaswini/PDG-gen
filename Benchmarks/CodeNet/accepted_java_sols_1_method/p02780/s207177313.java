import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		double p[]=new double[N];
		int k[]=new int[1001];
		double max=0,cout=0;
		for(int i=0;i<1001;i++){
			if(i!=0)
				k[i]=k[i-1]+i;
		}
		for(int i=0;i<N;i++){
			p[i]=stdIn.nextInt();
			p[i]=k[(int)p[i]]/p[i];
			if(i<K)
				cout+=p[i];
			else{
				if(max<cout)
					max=cout;
				cout-=p[i-K];
				cout+=p[i];
			}
		}
		if(max<cout)
			max=cout;
		System.out.println(max);
	}
}
