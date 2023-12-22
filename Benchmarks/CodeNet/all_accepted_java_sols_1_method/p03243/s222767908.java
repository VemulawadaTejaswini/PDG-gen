import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            if(n<=111*i){
                out.println(111*i);
                break;
            }
        }
    }
}