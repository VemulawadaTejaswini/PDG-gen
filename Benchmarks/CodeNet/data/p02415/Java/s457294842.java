import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++){
			if (isUpperCase(str.charAt(i))){
				System.out.print(toLowerCase(str.charAt(i)));
			} else {
				System.out.print(toUpperCase(str.charAt(i)));
			}
		}
		System.out.println("");
	}
}