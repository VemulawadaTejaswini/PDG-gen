import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        char[] s = new char[1200];
        for(int i=0; i<str1.length(); i++){
            s[i] = str1.charAt(i);
            if(Character.isLowerCase(s[i]) == true){
                s[i] = Character.toUpperCase(s[i]);
                System.out.printf("%c", s[i]);
            } else if(Character.isUpperCase(s[i]) == true){
                s[i] = Character.toLowerCase(s[i]);
                System.out.printf("%c", s[i]);
            } else System.out.printf("%c", s[i]);
        }
        System.out.println();
        sc.close();
    }
}
