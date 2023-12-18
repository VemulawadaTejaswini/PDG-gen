import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = 0;
        String w = sc.next();
        while(true){
            String t = sc.next();
            if(t.equalsIgnoreCase(w)) c++;
            else if(t.equals("END_OF_TEXT")) break;
        }
        System.out.println(c);
        sc.close();
    }
}
