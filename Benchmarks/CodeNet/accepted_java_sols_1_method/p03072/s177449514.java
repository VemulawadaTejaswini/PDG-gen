import java.util.*;
 
public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0;
		int prt=0;
		for(int i=0;i<n;i++){
			int h =sc.nextInt();
			if(h>=max){
				max=h;
				prt++;
			}
		}
		System.out.print(prt);
	}
}