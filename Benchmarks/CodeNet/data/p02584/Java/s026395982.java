import java.util.*;
public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		for(int i=0;i<y;i++) {
			if(x>0) {
				x-=z;
			}else {
				x+=z;
			}
			
		}
		System.out.println(Math.abs(x));
		
			}
		
	
}
