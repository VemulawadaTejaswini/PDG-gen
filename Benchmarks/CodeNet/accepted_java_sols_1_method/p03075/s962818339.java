import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		int j = 0;
		
		a = Math.abs(a);
		b = Math.abs(b);
		c = Math.abs(c);
		d = Math.abs(d);
		e = Math.abs(e);
		
		if(Math.max(a,b) - Math.min(a,b) > k){
		j += 1;
		}
		if(Math.max(a,c) - Math.min(c,a) > k){
		j += 1;
		}
		if(Math.max(a,d) - Math.min(d,a) > k){
		j += 1;
		}
		if(Math.max(a,e) - Math.min(e,a) > k){
		j += 1;
		}
		if(Math.max(b,c) - Math.min(c,b) > k){
		j += 1;
		}
		if(Math.max(b,d) - Math.min(d,b) > k){
		j += 1;
		}
		if(Math.max(b,e) - Math.min(e,b) > k){
		j += 1;
		}
		if(Math.max(c,d) - Math.min(d,c) > k){
		j += 1;
		}
		if(Math.max(d,e)- Math.min(d,e) > k){
		j += 1;
		}
		
		if( j > 0){
		System.out.println(":(");
		}else{
			System.out.println("Yay!");
		}
	}
}
