import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String W = sc.next();
        int count = 0;
        while(sc.hasNext()){
            String T = sc.next();
            if(T.equals("END_OF_TEXT")){
                break;
            }
            T = T.toLowerCase();
            if(T.equals(W)){
                count++;
            }
        }
        System.out.println(count);
    }
}
