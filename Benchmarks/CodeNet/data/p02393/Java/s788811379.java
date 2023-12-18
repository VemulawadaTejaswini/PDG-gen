import java.util.*;
      
class SortNum{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		int t;
		if(a > b){t=a; a=b; b=t;};
		if(b > c){t=b; b=c; c=t;};
		if(a > c){t=a; a=c; c=t;};
		System.out.println(a + " " + b + " " + c);
	}
}