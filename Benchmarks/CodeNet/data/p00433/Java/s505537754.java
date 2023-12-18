import java.util.Scanner;


public class Main{

	static Scanner sc = new Scanner(System.in);
	
	static int a[] = new int[4], b[] = new int[4];
	static int s = 0, t = 0;
	
	public static void main(String[] args) {
		
		while(read()){
			solve();
		}

	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		for(int i=0; i < 4; i++){
			a[i] = sc.nextInt();
		}
		for(int i=0; i < 4; i++){
			b[i] = sc.nextInt();
		}
		
		return true;
	}
	
	public static void solve(){
		for(int i=0; i < 4; i++){
			s += a[i];
			t += b[i];
		}
		
		if(s >= t){
			System.out.println(s);
		}
		else{
			System.out.println(t);
		}
	}

}