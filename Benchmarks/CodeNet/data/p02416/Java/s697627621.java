import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String [] s;
		int sum;
		
		while(true){
			String s1 = sc.next();
			s = new String[s1.length()];
	        sum = 0;
	        
	        for (int i = 0; i < s1.length(); i++) {
	        s[i] = String.valueOf(s1.charAt(i));
	        sum += Integer.valueOf(s[i]);
	        }
	        if(sum == 0){
	        	break;
	        }
	        System.out.println(sum);
	        s1 = new String();
		}
        sc.close();

	}

}
