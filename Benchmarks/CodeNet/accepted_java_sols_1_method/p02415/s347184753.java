import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>=65 && c <= 90) System.out.printf("%c", c+32);
            else if(c>=97 && c<=122) System.out.printf("%c", c-32);
            else System.out.printf("%c", c);
        }
        System.out.printf("\n");
        sc.close();
    }
}
