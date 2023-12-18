// AOJ 1142 列車の編成
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
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++) {
        	String arrive = sc.nextLine();
        	int n = arrive.length();
        	ArrayList<String> train = new ArrayList<String>();
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
        	for(int j = 0; j < train.size(); j++) {
        		String s = train.get(j);
        		boolean flag = true;
        		for(int k = j + 1; k < train.size(); k++) {
        			String t = train.get(k);
        			if(s.equals(t)) {     // 自分より末尾に同じ文字列があればカウントしない
        				flag = false;
			            break;
        			}
        		}
        		if(flag) cnt++;
        	}
        	System.out.println(cnt);
        }
    }
}
