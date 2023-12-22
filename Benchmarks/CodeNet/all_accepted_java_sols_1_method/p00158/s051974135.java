import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int num;
		int answer;

		while(true){
			num = sc.nextInt();

			if(num == 0){break;}
			answer = 0;
			while(num > 1){
				if(num % 2 == 0){
					num /= 2;
				}else{
					num = num * 3 + 1;
				}
				answer++;
			}
			System.out.println(answer);

		}
	}
}