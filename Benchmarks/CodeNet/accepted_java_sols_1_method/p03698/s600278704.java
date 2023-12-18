import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count = 0;
		char[] list = S.toCharArray();
		for(int i = 0; i < list.length; i++){
			for(int j = 0; j < list.length; j++){
				if(list[i] == list[j]){
					count += 1;
				}
			}
		}
		count -= list.length;
		if(count == 0){
				System.out.println("yes");
		}else{
				System.out.println("no");
		}
	}
}
