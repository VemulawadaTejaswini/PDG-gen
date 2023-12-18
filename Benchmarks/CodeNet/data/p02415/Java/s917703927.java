import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i;
        for(i=0; i < str.length(); i++){
            char c = str.charAt(i);
            if(65 <= c && c <= 90){
                System.out.print((char)(c + 32));
            }else if(97 <= c && c <= 122){
                System.out.print((char)(c - 32));
            }else{
                System.out.print((char)c);
            }
        }
        System.out.print("\n");

        sc.close();

    }
}
