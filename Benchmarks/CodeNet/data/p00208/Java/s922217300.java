import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	static{
		map.put("000", 0);
		map.put("001", 1);
		map.put("010", 2);
		map.put("011", 3);
		map.put("100", 5);
		map.put("101", 7);
		map.put("110", 8);
		map.put("111", 9);
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			String s = Integer.toBinaryString(n);
			int a = s.length()%3;
			if(a!=0)
			for(int i = 0;i<3-a;i++){
				s = "0"+s;
			}
			//System.out.println(s);
			for(int i = 0;i<s.length();i+=3){
				System.out.print(map.get(s.substring(i,i+3)));
			}
			System.out.println();
		}
	}

}