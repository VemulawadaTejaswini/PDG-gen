import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b=sc.nextInt();
		int[] c= new int[b];
		int t=0;
		for(int i =0;i<b;i++) {
			c[i]=sc.nextInt();
		}
		for(int i =0;i<b;i++) {
			for(int j=0;j<b;j++) {
				if(c[i]%c[j]==0&&j!=i) {
					t++;
					break;
				}
				
			}
		}
		System.out.println(b-t);
		
		
		
	}

}
