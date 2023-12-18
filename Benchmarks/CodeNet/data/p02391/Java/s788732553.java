import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//入力された二つの数字を変数に格納
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b){
			System.out.println("a > b");
		}else if(a < b){
			System.out.println("a < b");
		}else if(a == b){
			System.out.println("a == b");
		}else{
			System.out.println("error");
		}
		
	}
}

