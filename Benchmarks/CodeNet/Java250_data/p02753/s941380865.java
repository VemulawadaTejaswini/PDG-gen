import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String args[]){
        String e;
        Scanner s=new Scanner(System.in);
        e=s.nextLine();
        if(e.contains("A")&&e.contains("B"))
                System.out.println("Yes");
        else{
            System.out.println("No");
        }
    }
}