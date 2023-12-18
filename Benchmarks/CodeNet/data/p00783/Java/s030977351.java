import java.util.*;
public class Main {
	String input;
	ArrayList<C> oddlist, evenlist;
	int strlen;
	
	public class C implements Comparable<C> {
		String str;
		int len;
		public C(String str) {
			this.str = str;
			this.len = str.length();
		}
		public int compareTo(C o) {
			if(this.len < o.len) return 1;
			if(this.len > o.len) return -1;
			return 0;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String inputline = sc.nextLine();
			input = inputline.replaceAll("[^a-zA-Z]", "").toUpperCase();
			oddlist = new ArrayList<C>();
			evenlist = new ArrayList<C>();
			strlen = input.length();
			int mid = (strlen + 1) / 2 - 1;
			for(int i = mid; i >= 0; i--){
				//odd
				palindrome(i, 1);
				//even
				palindrome(i, 0);
			}
			for(int i = mid + 1; i < strlen; i++){
				//odd
				palindrome(i, 1);
				//even
				palindrome(i, 0);
			}
			
			//output preparation
			HashSet<Character> alreadyOdd = new HashSet<Character>();
			HashSet<Character> alreadyEven = new HashSet<Character>();
//			if(strlen % 2 == 0){
//				char addchar = input.charAt(mid);
//				alreadyEven.add(addchar);
//			}
//			else{
//				char addchar = input.charAt(mid);
//				alreadyOdd.add(addchar);
//			}
			//sort
			Collections.sort(oddlist);
			Collections.sort(evenlist);
			
			boolean isfirstprint = true;
			for(C nowc: oddlist){
				int nowmid = (nowc.len + 1) / 2 -1;
				char nowcmidchar = nowc.str.charAt(nowmid);
				if(alreadyOdd.contains(nowcmidchar)){
					
				}
				else{
					if(isfirstprint){
						System.out.print(nowc.str);
						isfirstprint = false;
					}
					else{
						System.out.print(" "+nowc.str);
					}
					alreadyOdd.add(nowcmidchar);
				}
			}
			for(C nowc: evenlist){
				int nowmid = (nowc.len + 1) / 2 -1;
				char nowcMidChar = nowc.str.charAt(nowmid);
				if(alreadyEven.contains(nowcMidChar)){
					
				}
				else{
					if(isfirstprint){
						System.out.print(nowc.str);
						isfirstprint = false;
					}
					else{
						System.out.print(" "+nowc.str);
					}
					alreadyOdd.add(nowcMidChar);
				}
			}
			System.out.println();
			
//			//debug
//			System.out.print(" odd= ");
//			for(String key: oddlist){
//				System.out.print(key + ",");
//			}
//			System.out.println();
//			System.out.print("even= ");
//			for(String key: evenlist){
//				System.out.print(key + ",");
//			}
//			System.out.println();
		}
	}
	
	private void palindrome(int mid, int checkdigit){
		if(checkdigit == 1){
			for(int i = 1;(mid - i) >= 0 && (mid + i) < strlen ; i++){
				int first = mid - i;
				int last = mid + i;
				if(input.charAt(first) == input.charAt(last)){
					String subpalindrome = input.substring(first, last + 1);
					oddlist.add(new C(subpalindrome));
				}
				else{
					break;
				}
			}
		}
		else{
			for(int i = 0;(mid - i) >= 0 && (mid + 1 + i) < strlen ; i++){
				int first = mid - i;
				int last = mid + 1 + i;
				if(input.charAt(first) == input.charAt(last)){
					String subpalindrome = input.substring(first, last + 1);
					if(i != 0){
						evenlist.add(new C(subpalindrome));
					}
				}
				else{
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
	
	
}