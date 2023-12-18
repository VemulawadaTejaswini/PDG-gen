import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String ans = "";
        for(int i = 0 ;i < line.length();i++){
            char ch = line.charAt(i);
            if(Character.isUpperCase(ch) == true){
                ch = Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch) == true){
                ch = Character.toUpperCase(ch);
            }
            ans += ch;
        }
        System.out.println(ans);
    }
}
