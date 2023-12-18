import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	String s = input.nextLine();
    	String ns = "";
    	for(int i = 0 ; i < s.length(); i++){
    		if(65 <= s.charAt(i) && s.charAt(i) <= 90){
    			ns += (char)(s.charAt(i)+32);
    		}else if(97 <= s.charAt(i) && s.charAt(i) <= 122){
    			ns += (char)(s.charAt(i)-32);
    		}else{
    			ns += s.charAt(i);
    		}
    	}
    	System.out.println(ns);
    }
}