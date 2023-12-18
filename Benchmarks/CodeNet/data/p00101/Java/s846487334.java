import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	static int num = 0;
	static String[] str;

	public static void main(String[] args) {
		read();
		solve();
	}

	public static void read(){
		num = sc.nextInt();
		str = new String[num];
		sc.nextLine();

		for(int i=0; i<num; i++){
			str[i] = sc.nextLine();
		}
	}


	public static void solve(){

		for(int i=0; i<num; i++){
			System.out.println(str[i].replaceAll("Hoshino", "Hoshina"));
		}
	}

}