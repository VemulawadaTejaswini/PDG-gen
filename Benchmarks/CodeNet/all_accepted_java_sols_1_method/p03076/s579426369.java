import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int min = 10;
		int answer = 0;
		for(int i = 0; i < 5; i++){
			int a = sc.nextInt();
			if(a%10 == 0){
				answer += a;
			}else if(a%10 < min){
				min = a%10;
				answer += a/10*10+10;
			}else{
				answer += a/10*10+10;
			}
		}
		answer -= 10 - min;
		System.out.println(answer);
	}
}