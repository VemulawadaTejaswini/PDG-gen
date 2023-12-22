import java.util.*;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		int G = sc.nextInt();
		
		int g = G*2;
		int a = 0;
		
		if(g==0){
			a = R*-1;
		}else{
			a = g-R;
		}
		
		System.out.println(a);
	}
}
