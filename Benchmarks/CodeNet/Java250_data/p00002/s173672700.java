import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int a = s.nextInt()+s.nextInt();
            System.out.println(Integer.toString(a).length());           
        }
    }
}