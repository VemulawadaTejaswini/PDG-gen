import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int s = 0;
	if(a<b) {
		for(;a<b;a++){
			if(c % a == 0) s++;
		}
			
		
			}
	else if(a>b);{
		for(; b<a;b++){
			if(c% b == 0)s++;}
	}
	if(a==b)if(c % a == 0) s++;	
	System.out.println(s);
	}
}