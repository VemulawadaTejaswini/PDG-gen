import java.util.Scanner;
public class Main {
	public static void main(String[] a){
		Scanner s=new Scanner(System.in);
		int i,sum=0,d;
		while(s.hasNext()){
			d=s.nextInt();
			for(i=1;d*i<600;i++){
				sum+=(int)Math.pow(d*i, 2)*d;
			}
			System.out.println(sum);
			sum=0;
		}
	}
}