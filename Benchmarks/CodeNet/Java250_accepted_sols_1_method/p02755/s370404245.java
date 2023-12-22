import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double s=a*25/2;
		double t=b*10;
		double min;
		if(s<t){
			min=t;
		}else{
			min=s;
		}
		double max;
		if(s+25/2<t+10){
			max=s+25/2;
		}else{
			max=t+10;
		}
		if(min%1!=0){
			min=min-min%1+1;
		}
		if(max%1!=0){
			max=max-max%1;
		}else{
			max=max-1;
		}

		if(min<=max){
			System.out.println((int)min);
		}else{
			System.out.println(-1);
		}
	}
}