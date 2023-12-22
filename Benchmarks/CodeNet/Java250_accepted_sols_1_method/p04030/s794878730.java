import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String result = "";
		for(int i=0; i<s.length(); i++){
			switch(s.charAt(i)){
			case '0':
				result += 0;
				break;
			case '1':
				result += 1;
				break;
			case'B':
				if(!result.isEmpty()){
					result = result.substring(0, result.length() - 1);
				}
				break;
			}
		}
		System.out.println(result);
	}
}
