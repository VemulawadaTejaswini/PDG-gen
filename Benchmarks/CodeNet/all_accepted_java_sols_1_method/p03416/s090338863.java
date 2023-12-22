import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int num=0;

		for(int i=a;i<=b;i++){
			int man=i/10000;
			int sen=(i-man*10000)/1000;
			int jyu=(i%100)/10;
			int iti=i%10;
			if(man==iti && sen==jyu) num++;
		}

		System.out.println(num);

	}
}