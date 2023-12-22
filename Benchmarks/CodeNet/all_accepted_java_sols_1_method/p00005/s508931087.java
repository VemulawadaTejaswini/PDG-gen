import java.util.*;
public class Main{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
	while(sc.hasNext()){
	long a = sc.nextLong();
		long b = sc.nextLong();
		long r = 0;
		long temp = 0;
		long LCM = 0;
		LCM = a * b;
		if ( a < b){
			temp = a;
			a = b;
			b = temp;	
		}
	for( r = a % b; r!=0;){
		temp = r;
		r = b % r;
		b = temp;
	}
	LCM = LCM / b; 
	System.out.println(b +" "+ LCM);
	}
}
}