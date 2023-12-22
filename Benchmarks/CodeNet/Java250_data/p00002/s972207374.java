import java.util.*;

public class Main {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int sum = sc.nextInt() + sc.nextInt();
            System.out.println((int)Math.log10(sum)+1);
        }
    }
}