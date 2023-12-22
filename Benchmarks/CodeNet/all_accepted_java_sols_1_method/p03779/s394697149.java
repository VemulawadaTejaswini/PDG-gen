import java.util.*;

public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int count = 0;
        int i1 = 0;
        for (; count < X;) {
            i1++;
            count += i1;
        }
        int dif = X-count;
        if (dif == 0) {
            System.out.println(i1);
            return;
        }
        int i2 = 0;
        for (; 0 < dif;) {
            i2++;
            dif -= i2;
        }
        System.out.println(i1-i2); 
    }
}
