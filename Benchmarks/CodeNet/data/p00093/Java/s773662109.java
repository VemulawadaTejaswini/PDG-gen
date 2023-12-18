import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int a, b,count;
	public static void main(String[] args) {
		while(read()){
			slove();
		}
	}

	static boolean read(){
		a = sc.nextInt();
		b = sc.nextInt();
		if(a == 0 && b == 0){
			return false;
		}
		return true;
	}

	static void slove(){
		count = 0;
		for(int i = a; i <= b; i++){
			if(i % 4 == 0 || i % 400 == 0 && i % 100 != 0 ){
				System.out.println(i);
				count++;
			}
		}
		if(count == 0)
			System.out.println("NA");
		System.out.println();
	}
}