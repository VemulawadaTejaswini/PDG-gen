import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		String operates = sc.next();
		sc.close();
		for(int a = 0 ; a < 4 ; a++){
			if(operates.charAt(a) == '+'){
				num++;
			}else{
				num--;
			}
		}
		System.out.println(num);
	}
}