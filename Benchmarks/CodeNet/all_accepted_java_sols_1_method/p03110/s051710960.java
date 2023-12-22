import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	double []hairetu1=new double[N];
	String []hairetu2=new String[N];
	double sum =0;
	for(int i=0;i<N;i++){
		hairetu1[i]=sc.nextDouble();
		hairetu2[i]=sc.next();
		
		if("JPY".equals(hairetu2[i])){
			sum=sum+hairetu1[i];
		}
		else if("BTC".equals(hairetu2[i])){
			sum=sum+hairetu1[i]*380000;
		}
	}
	System.out.println(sum);
	}
}
