import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a = "";
        int length = str.length();
        for(int i=0;i<length;i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)) a += Character.toLowerCase(c);
            else a += Character.toUpperCase(c);
        }
        System.out.println(a);
        sc.close();
    }
}
