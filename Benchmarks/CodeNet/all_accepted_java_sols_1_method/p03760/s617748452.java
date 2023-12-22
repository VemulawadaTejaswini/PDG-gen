import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        for(int i = 0 ; i < a.length() + b.length() ; i++){
            if(i % 2 == 0) System.out.print(a.charAt(i / 2));
            if(i % 2 == 1) System.out.print(b.charAt(i / 2));
        }
        System.out.println();
    }
}
//鶏になれ