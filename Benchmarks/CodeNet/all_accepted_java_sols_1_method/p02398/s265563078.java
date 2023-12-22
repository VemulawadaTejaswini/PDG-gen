import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int b = 1;
		int c = 1;
		int x = 0;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		for(; a <= b; a++){
			if(c % a == 0){
				x++;
			}
		}
		System.out.println(x);
	}	
}