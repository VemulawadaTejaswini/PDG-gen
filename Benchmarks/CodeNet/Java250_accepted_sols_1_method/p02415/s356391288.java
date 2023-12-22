import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] ch = line.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(Character.isUpperCase(ch[i])){
                ch[i] = Character.toLowerCase(ch[i]);
            }else if(Character.isLowerCase(ch[i])){
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println();
        sc.close();
    }
}