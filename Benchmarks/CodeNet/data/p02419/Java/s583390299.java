import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String W = sc.next();
		String temp = null;
		List<String> list = new LinkedList<>();
		int ans = 0;
		String END_OF_TEXT = "END_OF_TEXT";

		while(true){
			temp = sc.next();
			if(temp.equals(END_OF_TEXT)){
				break;
			}
			list.add(temp.toUpperCase());
		}
		for(String data: list){
			if(data.equals(W.toUpperCase())){
				ans ++;
				}
		}
		System.out.println(ans);
	}
}


