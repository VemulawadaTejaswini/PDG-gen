import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            BigDecimal n = new BigDecimal(0);

            String line = br.readLine();
            String[] ary = line.split(" ");
            if(ary[1].equals("?"))
                break;
            else {
                BigDecimal in1 = new BigDecimal(ary[0]);
                BigDecimal in2 = new BigDecimal(ary[2]);
                switch(ary[1]) {
                    case "+" :
                        n = in1.add(in2);
                        break;
                    case "-" :
                        n = in1.subtract(in2);
                        break;
                    case "*" :
                        n = in1.multiply(in2);
                        break;
                    case "/" :
                        n = in1.divide(in2);
                        break;
                }
                System.out.println(n.toPlainString());
            }

        }
    }
}