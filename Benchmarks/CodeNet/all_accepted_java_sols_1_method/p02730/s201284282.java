import java.util.Scanner;

/*
説明
*/
public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String n = s.next();
        String first = n.substring(0, (n.length())/2);
        String saigo = n.substring((n.length()+2)/2, n.length());

        String ans = "Yes";
        if (!first.equals(saigo)) {
            ans = "No";
        }
        System.out.println(ans);
    }
}