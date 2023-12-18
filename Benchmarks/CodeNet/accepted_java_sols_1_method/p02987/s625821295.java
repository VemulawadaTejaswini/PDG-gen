import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] count = new int[4];
		for(int i=0; i<4; i++){
			if(s.charAt(i) == s.charAt(0)){
				count[0]++;
			}else if(s.charAt(i) == s.charAt(1)){
				count[1]++;
			}else if(s.charAt(i) == s.charAt(2)){
				count[2]++;
			}else if(s.charAt(i) == s.charAt(3)){
				count[3]++;
			}
		}
		Arrays.sort(count);
		System.out.println(count[0] == 0 && count[1] == 0 && count[2] == 2 && count[3] == 2 ? "Yes" : "No");
	}
}
