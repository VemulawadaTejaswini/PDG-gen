import java.util.*;

class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(S.length() % 2 != 0){
			System.out.println("No");
			return;
		}
		for(int i = 0; i < S.length(); i += 2){
			int tmp = i + 2;
			String str = S.substring(i, tmp);
			if(str.equals("hi")){
				continue;
			}else{
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
	}

}