import java.util.Scanner;

public class Main {
	static String temp;
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args){

		temp = sc.next();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String doing = sc.next();
			if(doing.equals("print")){
				print(sc.nextInt(),sc.nextInt());
			}else if(doing.equals("reverse")){
				reverse(sc.nextInt(),sc.nextInt() );
			}else if(doing.equals("replace")){
				replace(sc.nextInt(),sc.nextInt());
			}
		}
	}
	static void print(int a, int b){
		System.out.println(temp.substring(a,b + 1));
	}
	static void reverse(int a, int b){
		StringBuilder str = new StringBuilder();
		str.append(temp.substring(a,b + 1));
		str.reverse();
		if(a != 0){
			temp = temp.substring(0,a) + str.toString() + temp.substring(b + 1, temp.length());
		}else {
			temp = str.toString() + temp.substring(b + 1, temp.length());
		}
	}
	static void replace(int a, int b){
		String str = sc.next();
		if(a != 0){
			temp = temp.substring(0,a) + str + temp.substring(b + 1, temp.length());
		}else {
			temp = str + temp.substring(b + 1, temp.length());
		}
	}
}