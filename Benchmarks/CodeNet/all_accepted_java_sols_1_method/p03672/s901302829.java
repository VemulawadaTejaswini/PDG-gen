import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String ans;
		String ans2;
		int answer = 0;
		for(int i = 1; i < str.length()+1; i++){
			ans = str.substring(0, str.length()-i);
			if(ans.length() % 2 == 0){
				if(ans.substring(0, ans.length()/2).equals(ans.substring(ans.length()/2, ans.length()))){
					answer = ans.length();
					break;
				}
			}
		}
		System.out.println(answer);

	}

}
