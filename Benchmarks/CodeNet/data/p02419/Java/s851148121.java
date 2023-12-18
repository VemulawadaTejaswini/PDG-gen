import java.util.Scanner;
import java.util.regex.*;


public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String pat = "\\b(\\z*"+sc.nextLine()+"\\z*)\\b";
        Pattern r = Pattern.compile(pat);
        
    
        
        
        int count = 0;
        while(true){
            String words = sc.next();
            String lowCase;
            if (words.equals("END_OF_TEXT")) {
                break;
            }else{
                lowCase = words.toLowerCase();
            }
            Matcher m = r.matcher(lowCase);
    
            if (m.find()) {
                count++;
            }
        }
        System.out.println(count);
        
    }
}

