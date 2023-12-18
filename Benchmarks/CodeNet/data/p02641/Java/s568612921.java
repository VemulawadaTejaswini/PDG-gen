import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] c= new int[b];
		for(int i =0;i<b;i++) {
			c[i]=sc.nextInt();
		}
		for(int i =0;i<b;i++) {
			if(a==c[i]) {
				a++;
				i=0;
			}
		}
		System.out.println(a);
		
	}

}
