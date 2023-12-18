
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        BigDecimal w=new BigDecimal( s1[0] );
        BigDecimal h=new BigDecimal( s1[1] );
        BigDecimal x=new BigDecimal( s1[2] );
        BigDecimal y=new BigDecimal( s1[3] );

        BigDecimal bd = w.multiply(h).divide(new BigDecimal(2));
        BigDecimal menseki=bd.setScale(9, BigDecimal.ROUND_DOWN);
        int judge=0;
        if (x.compareTo(w.divide(new BigDecimal(2)))==0 && y.compareTo(h.divide(new BigDecimal(2)))==0) {
        	judge=1;
        }

        System.out.println(menseki + " " + judge);
    }
}