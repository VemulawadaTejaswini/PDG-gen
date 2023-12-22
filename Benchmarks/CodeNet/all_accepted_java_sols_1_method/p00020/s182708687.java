import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
        	char c = s.charAt(i);
        	if(97 <= c && c <= 122){
        		sb.append((char)(c-32));
        	}else{
        		sb.append(c);
        	}
        }
        System.out.println(sb);
    }
}