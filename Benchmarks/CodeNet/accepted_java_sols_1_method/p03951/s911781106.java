import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s [] = sc.next().split("");
		String t [] = sc.next().split("");

		int answer = n*2;
		int sum = 0;
		for(int  i = 0;i < n;i++){
			if(s[i].equals(t[0])){
				sum++;
				for(int j = i+1;j < n;j++){
					if(s[j].equals(t[j-i])){
						sum++;
					}else{
						sum = 0;
					}
				}
			}
			if(sum > 0){
				answer -= sum;
				break;
			}
		}

		System.out.println(answer);
	}
}