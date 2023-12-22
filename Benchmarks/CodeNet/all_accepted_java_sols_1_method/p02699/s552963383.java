import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sheep =s.nextInt();
        int wolf=s.nextInt();
        if(sheep>wolf){
            System.out.println("safe" );
        }else {
            System.out.println("unsafe");
        }
    }
}