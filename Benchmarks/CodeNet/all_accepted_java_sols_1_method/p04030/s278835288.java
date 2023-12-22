import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
        String s = sc.next();
        StringBuilder answer = new StringBuilder();
        
        for(int i=0;i < s.length();i++){
          //System.out.println(s.charAt(i));
          
          if (String.valueOf(s.charAt(i)).equals("B")){
            if (answer.length() > 0)
              answer.setLength(answer.length()-1);
          } else {
            answer.append(s.charAt(i));
          }
        }
      
        System.out.println(answer);
        
	} 
}