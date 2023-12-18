import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int max = 0;
		int count = 0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T'){
				count++;
				if(count > max){
					max = count;
				}
			}else{
				count = 0;
			}
		}
		System.out.println(max);
	}
}