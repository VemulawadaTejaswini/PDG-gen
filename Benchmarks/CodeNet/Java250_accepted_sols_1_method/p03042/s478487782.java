import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt();

        int s1 = s / 100;
        int s2 = s - (s1 * 100);

        if (s1 > 0 && s1 <= 12 && s2 > 0 && s2 <= 12)
            System.out.println("AMBIGUOUS");
        else if (s1 > 0 && s1 <= 12)
            System.out.println("MMYY");
        else if (s2 > 0 && s2 <= 12)
            System.out.println("YYMM");
        else
            System.out.println("NA");
        sc.close();
    }
}