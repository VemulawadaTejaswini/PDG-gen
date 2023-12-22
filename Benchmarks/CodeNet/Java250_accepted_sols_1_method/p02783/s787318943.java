import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ct = 0;
		int hp = sc.nextInt();
		int at = sc.nextInt();
		while(hp > 0){
			hp -= at;
			ct ++;
		}
		System.out.println(ct);
	}

}