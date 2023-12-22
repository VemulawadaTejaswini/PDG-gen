import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();



        int c = 0;
        switch (S){
            case("RRR"): c=3; break;
            case("SSS"): c=0; break;
            case("RRS"): c=2; break;
            case("SRR"): c=2; break;
            default: c=1; break;
        }



        System.out.println(c);

    }
}