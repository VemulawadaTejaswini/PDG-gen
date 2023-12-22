import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] str2 = new String[3];
        str2 = str.split("");
        Arrays.sort(str2);
        if( !(str2[1].equals(str2[2])) && str2[0].equals(str2[1]) && str2[2].equals(str2[3])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}