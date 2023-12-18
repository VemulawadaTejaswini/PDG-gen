import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


class RecurringDecimal{
	private int n, digit;
	private String minString;
	
	public RecurringDecimal(int n, int digit) {
		this.n = n;
		this.digit = digit;
		this.minString = getMinString();
	}
	
	private String getMinString(){
		char[] nCharArray = getPadZero().toCharArray();
		Arrays.sort(nCharArray);
		return new String(nCharArray);
	}
	
	private String getPadZero(){
		String nString = Integer.toString(n);
		int nLength = digit - nString.length();
		String zeros = "";
		for(int i = 0; i < nLength; i++) zeros += "0";
		return zeros+nString;
	}
	
	int getMin(){
		return new Integer(minString);
	}
	
	int getMax(){
		return new Integer(new StringBuffer(minString).reverse().toString());
	}
}

public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		
		while(true){
			int n =sn.nextInt(), digit =sn.nextInt();
			if(n == 0 && digit == 0) break;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(n, 0);
			RecurringDecimal rd = new RecurringDecimal(n, digit);
			int idx =1;
			while(true){
				int newN = rd.getMax() - rd.getMin();
				if(map.containsKey(newN)){
					int j = map.get(newN);
					System.out.println(j+" "+newN+" "+(idx-j));
					break;
				} else{
					map.put(newN, idx);
					rd = new RecurringDecimal(newN, digit);
					idx++;
				}
			}
		}
		
	}
}