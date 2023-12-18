import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;

		while(true){
			str = sc.nextLine();
			if(str.equals("END OF INPUT")){
				break;
			}

			int count = 0;
			int len = str.length();
			String ans = "";
			for(int i=0;i<len;i++){
				if(str.charAt(i) == ' '){
					ans += count+"";
					count = 0;
				}else{
					count++;
				}
			}
			ans += count+"";
			System.out.println(ans);
		}
	}

}