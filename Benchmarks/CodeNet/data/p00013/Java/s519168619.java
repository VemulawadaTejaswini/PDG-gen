import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static int n, current = 0;
	static int stack[] = new int[10];
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}

	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		n = sc.nextInt();
		
		return true;
	}
	
	public static void solve(){
		if(n == 0){
			current--;
			System.out.println(stack[current]);
			stack[current] = 0;
			return;
		}
		
		stack[current] = n;
		current++;
	}

}