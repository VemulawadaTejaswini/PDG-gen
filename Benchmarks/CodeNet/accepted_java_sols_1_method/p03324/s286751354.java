import java.util.*;
class Main{

public static void main(String[] args){

Scanner s = new Scanner(System.in);
long d = s.nextInt() , n = s.nextInt();

	if(d == 0){
		if(n!=100)
		System.out.println(n);
		else
			System.out.println(101);
	}
	else if(d == 1){
		if(n!=100)
		System.out.println(100*n);
		else
			System.out.println(100*n+100);
	}
	else
	{
		if(n!=100)
		System.out.println(10000*n);
		else
			System.out.println(10000*n+10000);
	}
}
}