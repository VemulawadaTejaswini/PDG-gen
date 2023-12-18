import java.util.ArrayList;
import java.util.Scanner;
 
public class Main{
	
	static String reverse(String ss) {
		StringBuffer s = new StringBuffer(ss);
		s.reverse();
		return s.toString();
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        for(int i = 0; i < m; i++) {
        	String arrive = sc.nextLine();
        	int n = arrive.length();
        	ArrayList<String> train = new ArrayList<>();
        	for(int j = 1; j <= n - 1; j++) {
        		String f = arrive.substring(0, j);
        		String b = arrive.substring(j);        	
        		String fre = reverse(f);
        		String bre = reverse(b);
        		//System.out.println(f + " " + b + " " + fre + " " + bre);
        		train.add(f + b);
        		train.add(f + bre);
        		train.add(fre + b);
        		train.add(fre + bre);
        		train.add(b + f);
        		train.add(b + fre);
        		train.add(bre + f);
        		train.add(bre + fre);
        	}
        	
//        	for(int k = 0; k < train.size(); k++) {
//        		System.out.println(train.get(k));
//        	}
//        	System.out.println();
//        	
        	int cnt = 0;
        	while(! train.isEmpty()) {
        		String s = train.get(0);
        		cnt++;
        		for(int k = 0; k < train.size(); k++) {
        			if(s.equals(train.get(k))) {
        				train.remove(k);
        			}
        		}
        	}
        	System.out.println(cnt);
        }
    }
}

