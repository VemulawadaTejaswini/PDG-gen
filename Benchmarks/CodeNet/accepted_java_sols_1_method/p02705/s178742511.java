    import java.util.Scanner;
    import java.lang.Math;
    import java.math.BigDecimal;
     
    class Main{
     
        public static void main(String[] args){
     
            Scanner scanner = new Scanner(System.in);
            int r = scanner.nextInt();
            scanner.close();
            BigDecimal bd1 = new BigDecimal(2.0 * r);
            BigDecimal bd2 = new BigDecimal(Math.PI);
            BigDecimal result = bd1.multiply(bd2);
            System.out.println(result.setScale(2, BigDecimal.ROUND_HALF_UP));
     
        }
     
    }