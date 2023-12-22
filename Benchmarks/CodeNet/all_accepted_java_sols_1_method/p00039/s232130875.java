import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> table = new HashMap<Character, Integer>();
		table.put('I',1);
		table.put('V',5);
		table.put('X',10);
		table.put('L',50);
		table.put('C',100);
		table.put('D',500);
		table.put('M',1000);
		while(sc.hasNext()){
			String line = sc.nextLine();
			StringBuilder sb = new StringBuilder(line);
			int result=0 , sum , nowNum , nextNum;
			sum = table.get(sb.charAt(0));
			for(int i=0; i<sb.length()-1; i++){
				nowNum = table.get(sb.charAt(i));
				nextNum = table.get(sb.charAt(i+1));
				if ( nowNum == nextNum )
					sum += nowNum;
				else if ( nowNum > nextNum ) {
					result += sum;
					sum = nextNum;
				} else {
					result += nextNum - sum;
					sum = 0;
				}
			}
			result += sum != 0 ? sum : 0;
			System.out.println(result);
		}
	}
}