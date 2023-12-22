import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char[] a = {'M', 'A', 'R', 'C', 'H'};
        int[] count = new int[5];
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            String name = sc.next();
            for(int j=0; j<5; j++) {
                if(name.charAt(0) == a[j]) {
                    count[j]++;
                }
            }
        }
        BigDecimal res = new BigDecimal("0");
        for(int i=0; i<5; i++) {
            for(int j=i+1; j<5; j++) {
                for(int k=j+1; k<5; k++){
                    res = res.add(new BigDecimal((long)count[i] * count[j] * count[k]));
                }
            }
        }

        System.out.println(res.toPlainString());
    }

}
