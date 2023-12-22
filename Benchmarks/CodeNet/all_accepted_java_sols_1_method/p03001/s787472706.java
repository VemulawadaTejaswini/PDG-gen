import java.math.BigDecimal;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int w = Integer.parseInt(strs[0]);
        int h = Integer.parseInt(strs[1]);
        int x = Integer.parseInt(strs[2]);
        int y = Integer.parseInt(strs[3]);
        BigDecimal area = new BigDecimal(w).multiply(new BigDecimal(h)).divide(new BigDecimal(2)).setScale(10);
        int num = ((x*2==w)&&(y*2==h))?1:0;
        System.out.println(area+" "+num);
    }
}