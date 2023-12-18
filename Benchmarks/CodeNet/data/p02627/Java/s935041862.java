import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char S=scanner.next().charAt(0);
        if(Character.isUpperCase(S)){
            System.out.println("A");
        }else{
            System.out.println("a");
        }
    }
}
