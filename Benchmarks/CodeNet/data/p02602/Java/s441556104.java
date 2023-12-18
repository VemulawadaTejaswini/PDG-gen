import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
		int a =sc.nextInt();
		int b =sc.nextInt();
		int[] c =new int[a];
		for(int i =0 ;i<a;i++){
			c[i]= sc.nextInt();
		}
		for(int i =0 ;i<(a-b);i++){
			int d=1;
			int f =1;
			for(int j =0;j<b;j++) {
				d *=c[i+j];
				f *=c[i+1+j];
			}
			 
			if(f>d) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		
		}
		
		

		

	}

}

