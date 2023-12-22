import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String alp = "abcdefghijklmnopqrstuvwxyz";
		int[] a = new int[alp.length()];
		for(int i=0; i<s.length(); i++){
			for(int j=0; j<alp.length(); j++){
				if(s.charAt(i) == alp.charAt(j)){
					a[j]++;
				}
			}
		}
		String result = "Yes";
		for(int i : a){
			if(i % 2 != 0){
				result = "No";
			}
		}
		System.out.println(result);
	}
}
