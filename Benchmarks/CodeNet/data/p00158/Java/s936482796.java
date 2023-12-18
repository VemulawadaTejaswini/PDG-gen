import  java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		while(read()){
			slove();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n != 0) return true;

		return false;
	}
	static void slove(){
		int i = 0;
		while(n != 1){
			if(n%2 == 0){
				n = n/2;
			}else{
				n = n*3 + 1;
			}
			i++;
		}
		System.out.println(i);
	}
}