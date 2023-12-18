import java.util.*;
public class Main {
	String input;
	ArrayList<String> printevenlist, evenlist, printoddlist, oddlist;
	int strlen;

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
			if(lastadd != null && ! printoddlist.contains(lastadd))
				printoddlist.add(lastadd);
			if(oddlist.size() != 0)
				oddlist.remove(oddlist.size()-1);
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
			if(lastadd != null && ! printevenlist.contains(lastadd))
				printevenlist.add(lastadd);
			if(evenlist.size() != 0)
				evenlist.remove(evenlist.size() - 1);
		}
	}
	
	private void print(){
		int len = printoddlist.size();
		boolean isfirstprint = true;
		for(int i = 0; i < len; i++){
			String nowstr = printoddlist.get(i);
			if(oddlist.contains(nowstr)) continue;
			if(isfirstprint){
				System.out.print(nowstr);
				isfirstprint = false;
			}
			else{
				System.out.print(" " + nowstr);
			}
		}
		len = printevenlist.size();
		for(int i = 0; i < len; i++){
			String nowstr = printevenlist.get(i);
			if(evenlist.contains(nowstr)) continue;
			if(isfirstprint){
				System.out.print(nowstr);
				isfirstprint = false;
			}
			else{
				System.out.print(" " + nowstr);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
	
	
}