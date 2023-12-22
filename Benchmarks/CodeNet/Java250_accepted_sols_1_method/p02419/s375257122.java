import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count=0;
		String W = sc.next();
		while(true){
			String T = sc.next();
			if(T.equals("END_OF_TEXT")){
				break;
			}else{
				T = T.toLowerCase();
				if(T.equals(W)||T.equals(W+",")||T.equals(W+".")){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}