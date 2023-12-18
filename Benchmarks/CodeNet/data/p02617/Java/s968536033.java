import java.util.*;
interface Main{
	static void main(String[]$){
		var s=new Scanner(System.in);
		long n=s.nextInt(),a=n++*n++*n--/6,m=n;
		while(n-->2){long u=s.nextInt(),v=s.nextInt();a-=(u<v?u:v)*m-u*v;}
		System.out.print(a);
	}
}