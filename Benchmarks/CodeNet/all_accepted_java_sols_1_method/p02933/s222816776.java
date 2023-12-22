import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String S = s.next();
        if(a>=3200){
            System.out.print(S);
        }
        else{
            System.out.println("red");
        }
    }
}
