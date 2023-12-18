import java.util.*;
public class Main {
	String input;
	ArrayList<String> printevenlist, evenlist, printoddlist, oddlist;
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
			oddlist = new ArrayList<String>();
			evenlist = new ArrayList<String>();
			printoddlist = new ArrayList<String>();
			printevenlist = new ArrayList<String>();
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
			print();

		}
	}
	
	private void palindrome(int mid, int checkdigit){
		String lastadd = null;
		if(checkdigit == 1){
			for(int i = 1;(mid - i) >= 0 && (mid + i) < strlen ; i++){
				int first = mid - i;
				int last = mid + i;
				if(input.charAt(first) == input.charAt(last)){
					String subpalindrome = input.substring(first, last + 1);
					oddlist.add(subpalindrome);
					lastadd = subpalindrome;
				}
				else{
					break;
				}
			}
			if(lastadd != null && ! printoddlist.contains(lastadd)) printoddlist.add(lastadd);
		}
		else{
			for(int i = 0;(mid - i) >= 0 && (mid + 1 + i) < strlen ; i++){
				int first = mid - i;
				int last = mid + 1 + i;
				if(input.charAt(first) == input.charAt(last)){
					String subpalindrome = input.substring(first, last + 1);
					if(i != 0){
						evenlist.add(subpalindrome);
						lastadd = subpalindrome;
					}
				}
				else{
					break;
				}
			}
			if(lastadd != null && ! printevenlist.contains(lastadd)) printevenlist.add(lastadd);
		}
	}
	
	private void print(){
		int len = printoddlist.size();
		boolean isfirstprint = true;
		for(int i = 0; i < len; i++){
			if(isfirstprint){
				System.out.print(printoddlist.get(i));
				isfirstprint = false;
			}
			else{
				System.out.print(" " + printoddlist.get(i));
			}
		}
		len = printevenlist.size();
		for(int i = 0; i < len; i++){
			if(isfirstprint){
				System.out.print(printevenlist.get(i));
				isfirstprint = false;
			}
			else{
				System.out.print(" " + printevenlist.get(i));
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
	
	
}