import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		String stdin = std.nextLine();
		String stdout = "";
		for(int i=0; i<stdin.length(); i++){
			if(String.valueOf(stdin.charAt(i)).matches("[a-z]")){
				stdout += String.valueOf(stdin.charAt(i)).toUpperCase();
			}else if(String.valueOf(stdin.charAt(i)).matches("[A-Z]")){
				stdout += String.valueOf(stdin.charAt(i)).toLowerCase();
			}else{
				stdout += String.valueOf(stdin.charAt(i));
			}
		}
		System.out.println(stdout);
	}
}