import java.util.*;

public class Main {
    public static int five = 0;
    public static int seven = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        check(text.split(" ")[0]);
        check(text.split(" ")[1]);
        check(text.split(" ")[2]);
        System.out.println(five==2 && seven ==1 ? "YES":"NO");
    }
    public static void check(String str){
        int number = Integer.parseInt(str);
        if(number==5)five++;
        if(number==7)seven++;
    }

}