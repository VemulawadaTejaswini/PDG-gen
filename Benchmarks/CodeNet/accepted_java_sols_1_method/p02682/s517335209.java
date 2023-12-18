import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		int a,b,c,d,i,s =0;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		for(i=0;i<a;i++) {
			if(d == 0)break;
			d--;
			s++;
		}
		for(i=0;i<b;i++) {
			if(d == 0)break;
			d--;
		}
		for(i=0;i<c;i++) {
			if(d == 0)break;
			d--;
			s--;
		}
		System.out.println(s);
	}	
}
