import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		String a1 = cin.next();
		String a2 = cin.next();

		String result="";

		if(a1.length()>a2.length()){
			result = "GREATER";
		}else if(a1.length()<a2.length()){
			result = "LESS";
		}else if(a1.equals(a2)){
			result = "EQUAL";
		}else{
			for(int i=0;i<a1.length();i++){
				if(a1.charAt(i)!=a2.charAt(i)){
					if(Character.getNumericValue(a1.charAt(i))>Character.getNumericValue(a2.charAt(i))){
						result = "GREATER";
						break;
					}else{
						result = "LESS";
						break;
					}
				}
			}
		}
		System.out.println(result);
	}
}
