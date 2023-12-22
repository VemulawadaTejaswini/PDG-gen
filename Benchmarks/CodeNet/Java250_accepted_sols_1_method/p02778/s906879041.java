import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String s = scan.next();
        String str = "";
        for (String i : s.split("") ){
            str += "x";
        }
        System.out.println(str);
    }
}