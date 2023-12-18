import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int a, b, c;
	public static void main(String[] args) {
		read();
		slove();
	}

	static boolean read(){
		a = sc.nextInt();
		b = sc.nextInt();
		return true;
	}
	
	   static void slove(){
			c = a + b;
			//System.out.println("c =" + c);
			int i = 1;
			int j = 0;
			if(c == 0){
				System.out.println(1);
			    return;
			}
			while(c >= i){
			    
				//System.out.println("i =" + i);
				//System.out.println("j =" + j);
				i = i*10;
				j++;
			}			
			System.out.println(j);
	   }
}