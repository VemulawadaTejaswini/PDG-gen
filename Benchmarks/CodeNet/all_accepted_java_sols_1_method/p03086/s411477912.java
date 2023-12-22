import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int longest = 0;
		int count = 0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T'){
				count++;
				if(count > longest){
					longest = count;
				}
			}else{
				count = 0;
			}
		}
		System.out.println(longest);
	}
}
