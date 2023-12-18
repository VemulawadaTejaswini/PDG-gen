import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int[] c =new int[a];
		for(int i =0 ;i<a;i++){
			c[i]= sc.nextInt();
		}
		int d=1;
		int f=1;
		for(int j=0;j<b;j++) {
			d *=c[j];
		}
		for(int i =0 ;i<(a-b);i++){
			f= d*c[b+i]/c[i];
			
			 
			if(f>d) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			d=f;
		}
		
		
		
		

		

	}

}

