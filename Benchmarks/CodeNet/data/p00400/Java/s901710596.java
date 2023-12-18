import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch >= 65 && ch <= 90)
            System.out.println(1);
        else if(ch >= 97 && ch <= 122)
            System.out.println(2);
        else
            System.out.println(0);
    }
}
