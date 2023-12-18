import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String text = sc.next();
        
        if(text.length() == 19){
            text = text.replace(",", " ");
        }
        
        System.out.println(text);
	}
}