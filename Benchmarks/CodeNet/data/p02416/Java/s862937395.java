import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> box = new ArrayList<Integer>();
		int sum;
		
		while(true){
			String s1 = sc.nextLine();
	        Integer[] intArray = new Integer[s1.length()];
	        sum = 0;
	        
	        for (int i = 0; i < s1.length(); i++) {
	        sum += (int)s1.charAt(i);
	        }
	        s1 = new String();
	        if(sum == 0){
	        	break;
	        }
	        System.out.println(sum);
		}
        sc.close();

	}

}
