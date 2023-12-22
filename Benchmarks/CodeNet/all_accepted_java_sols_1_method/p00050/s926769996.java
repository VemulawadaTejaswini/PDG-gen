import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String str1 = str.replaceAll("apple","り");
        String str2 = str1.replaceAll("peach","ぴ");

        String str3 = str2.replaceAll("り","peach");
        String str4 = str3.replaceAll("ぴ","apple");

        System.out.println(str4);
    }
}
