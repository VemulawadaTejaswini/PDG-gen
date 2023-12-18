import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = nextInt();
        String s = String.valueOf(a);
        char[] work = new char[text.length()];
        
        for (int i = 0; i < text.length(); i++){
        	work[i] = text.charAt(i);
        }
        if (work[text.length-1] == '2' || work[text.length-1] == '4' || work[text.length-1] == '5' || work[text.length-1] == '7' || work[text.length-1] == '9'){
        	System.out.println("hon");
        }
        else if (work[text.length-1] == '0' || work[text.length-1] == '6' || work[text.length-1] == '1' || work[text.length-1] == '8'){
        	System.out.println("pon");
        }
        else{
        	System.out.println("bon");
        }
		
      
    }
}