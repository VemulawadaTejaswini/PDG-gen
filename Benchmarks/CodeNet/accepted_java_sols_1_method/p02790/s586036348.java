import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String ansa ="";
		String ansb ="";
		int ia = Integer.parseInt(a);
		int ib = Integer.parseInt(b);
		for(int i = 0;i<ia;i++){
			ansb+=b;
		}
		for(int i = 0;i<ib;i++){
			ansa+=a;
		}
		if(ia<=ib){
			System.out.println(ansa);
		}else{
			System.out.println(ansb);
		}
	}
}