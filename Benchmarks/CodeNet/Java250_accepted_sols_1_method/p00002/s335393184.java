import java.util.*;
 
class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Integer> digitList = new ArrayList<>(); 
    	
    	int a, b;
    	int digit;
    	String strDigit;
    	int cnt = 0;
    	while(sc.hasNext()) {
    		a = sc.nextInt();
    		b = sc.nextInt();
    		digit = a + b;
    		strDigit = String.valueOf(digit);
    		digitList.add(strDigit.length());
    		cnt++;
    	}
    	for(int i = 0; i < cnt; i++) {
    		System.out.println(digitList.get(i));
    	}
	}
}