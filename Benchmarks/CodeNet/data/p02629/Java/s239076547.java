import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String[] a = {"z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y"};
		long tmp = n;
		int ct = 1;
		while(tmp > 26){
			tmp /= 26L;
			ct++;
		}
		int[] num = new int[ct];
		for(int i = 0; i < ct; i++){
			num[i] = (int) (n % 26);
			n = n / 26;
		}
		for(int i = ct - 1; i >= 0; i--){
			System.out.print(a[(int) num[i]]);
		}
		sc.close();

	}

}