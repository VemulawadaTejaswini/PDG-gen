import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tHp = sc.nextInt();
		int tAttack = sc.nextInt();
		int aHp = sc.nextInt();
		int aAttack = sc.nextInt();
		String result = "";
		while(true){
			aHp -= tAttack;
			if(aHp <= 0){
				result = "Yes";
				break;
			}
			tHp -= aAttack;
			if(tHp <= 0){
				result = "No";
				break;
			}
		}
		System.out.println(result);
	}
}
