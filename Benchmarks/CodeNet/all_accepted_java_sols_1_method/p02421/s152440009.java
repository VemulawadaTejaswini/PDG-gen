import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String taro,hanako;
		int n = sc.nextInt();
		int taroscore = 0;
		int hanakoscore = 0;
		for(int i = 0; i < n; i++){
			taro = sc.next();
			hanako = sc.next();
			if(taro.compareTo(hanako) == 0){
				taroscore++;
				hanakoscore++;
			}else if(taro.compareTo(hanako) > 0){
				taroscore = taroscore + 3;
			}else if(taro.compareTo(hanako) < 0){
				hanakoscore = hanakoscore + 3;
			}
		}
		
		System.out.println(taroscore + " " + hanakoscore);
	}
}