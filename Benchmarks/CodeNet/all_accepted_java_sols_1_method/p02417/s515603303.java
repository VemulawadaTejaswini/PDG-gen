import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
            int [] character = new int[26];
            while(sc.hasNextLine()){
                String text = sc.nextLine();
                           if (text.isEmpty()) {
                                    break;
                           }
                char [] ch = new char[text.length()];
                for (int i = 0; i < text.length(); i++) {
                    ch[i] = text.toLowerCase().charAt(i);
                }
                
                for (int c = 0; c < ch.length; c++) {
                    if ('a' <= ch[c] && ch[c] <= 'z') {
                        character[ch[c] - 'a']++; 
                    }
                    
                }
               
            }
            for (int i = 0; i < character.length; i++) {
                    System.out.println( (char)(i + 'a') + " : " + character[i]);
            }
    }
}

