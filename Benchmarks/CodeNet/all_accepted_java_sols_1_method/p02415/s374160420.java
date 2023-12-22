import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {  
        try (Scanner sc = new Scanner(System.in)) { 
            String line = sc.nextLine(); 
            String answer = ""; 
            int length = line.length(); 
            for (int i = 0; i < length; i++) { 
                char ch = line.charAt(i); 
                if(Character.isLowerCase(ch) == true){
                    ch = Character.toUpperCase(line.charAt(i));
                } else if(Character.isLowerCase(ch) == false){
                    ch = Character.toLowerCase(line.charAt(i));
                }
                answer = answer + ch;
            } 
            System.out.println(answer); 
        } 
    }
}

