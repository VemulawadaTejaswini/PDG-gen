import java.util.Scanner;

class Main4{

	public static void main(String[] args) {

        double r;

        //MathContext mc = new MathContext(6, RoundingMode.HALF_UP);

        Scanner scan = new Scanner(System.in);

        r = scan.nextDouble();
        //System.out.println(Math.pow(r, 2) );
/*        BigDecimal rr = BigDecimal.valueOf(r).pow(2);
        BigDecimal pipi = new BigDecimal(Math.PI);
        BigDecimal rrpi = rr.multiply(pipi,mc);*/

        //BigDecimal mul = rr.multiply(rr, 8, 0);

/*        System.out.println(rrpi);
        System.out.printf("%f\n", rrpi);*/
        System.out.printf("%f %f\n", Math.pow(r, 2)*Math.PI, 2*r*Math.PI);
/*
        //BigDecimal div = new BigDecimal("0.00000000");

        BigDecimal div = aa.divide(bb, 8, BigDecimal.ROUND_HALF_UP);

        DecimalFormat format = new DecimalFormat("#.#");
        format.setMaximumFractionDigits(8);//?????§8????????§??????

        System.out.println(a/b + " " + a%b + " "+ format.format(div) );
        */
        scan.close();
    }

}