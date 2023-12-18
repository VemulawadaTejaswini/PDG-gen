import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int length;
	static int[] array;
	public static void main(String[] args) {
		while(read()){
			solve();
		}

	}
	
	static boolean read(){
		length = sc.nextInt();
		if(length == 0) return false;
		array = new int[length];
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		return true;	
	}
	
	static void solve(){
		int n = 32;
		int index = 0;
		while(n > 0){
			n = n - (n - 1)%5;
			System.out.println(n);
			n = n - array[index];
			if(n >= 0){
				System.out.println(n);
			}else{
				System.out.println(0);
			}
			index = (index+1)%length;
		}
	}
}