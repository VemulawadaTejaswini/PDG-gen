import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            String line = sc.nextLine();
            StringBuilder answer = new StringBuilder("");
            int length = line.length();
            for (int i = 0; i < length; i++) {
                char ch = line.charAt(i);
                if(Character.isLowerCase(ch)){
                    answer.append(Character.toUpperCase(ch));

                }else if(Character.isUpperCase(ch)){
                    answer.append(Character.toLowerCase(ch));
                }else{
                    answer.append(ch);
                }
            }
            System.out.println(answer);
        }
    } 
}
