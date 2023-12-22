import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        boolean b = r-l>=2019;
        l %= 2019;
        r %= 2019;
        if (l>r||b) {
            System.out.println(0);
        }else {
            int min = 2019;
            for (int i=l;i<r;i++){
                for (int j=i+1;j<=r;j++){
                    min = Math.min(min,(i*j)%2019);
                }
            }
            System.out.println(min);
        }


    }
}
