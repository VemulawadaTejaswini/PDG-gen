import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int length = c.nextInt();
        c.nextLine();
        String s = c.nextLine();
        if(s.length() <= length){
            System.out.println(s);
        }else{
            System.out.println(s.substring(0,length)+"...");
        }
    }
}