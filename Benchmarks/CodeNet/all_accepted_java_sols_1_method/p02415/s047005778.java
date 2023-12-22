import java.util.*;

public class Main{
    public static void main(String[] args){
        String str;
        char c;
        Scanner scanner = new Scanner(System.in);

        str = scanner.nextLine();

        int i;
        for(i = 0; i < str.length(); i++){
            if(64 < str.charAt(i) && str.charAt(i) < 91){
                c = (char)(str.charAt(i) + 32);
                System.out.print(c);
            }
            else if(96 < str.charAt(i) && str.charAt(i) < 123){
                c = (char)(str.charAt(i) - 32);
                System.out.print(c);
            }
            else System.out.print(str.charAt(i));
        }
        System.out.println("");


        scanner.close();
    }
}
