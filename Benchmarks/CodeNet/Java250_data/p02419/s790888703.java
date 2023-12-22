import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int ans = 0;
		String search = std.next().toLowerCase();
		while(std.hasNext()){
			String word = std.next().toLowerCase();
			if(word.equals("END_OF_TEXT")){
				break;
			}else if(word.equals(search)){
				ans++;
			}
		}
		System.out.println(ans);
	}
}