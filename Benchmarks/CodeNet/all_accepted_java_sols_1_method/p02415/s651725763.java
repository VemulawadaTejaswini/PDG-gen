import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(ch[i])){
                ch[i] = Character.toLowerCase(ch[i]);
            }
            else if(Character.isLowerCase(ch[i])){
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(ch);
    }
}