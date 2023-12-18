import java.util.*;
public class Main{
public static void main(String gg[]){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int ascii = a;
        if(ascii>=97 && ascii<122){
            System.out.println((char)(ascii+1));
        }
    }
}