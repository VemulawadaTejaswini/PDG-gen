import java.math.BigDecimal;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(in.readLine());
        String[] field = s.split(" ", 0);
        
        BigDecimal vertical = new BigDecimal(field[0]);
        BigDecimal width = new BigDecimal(field[1]);
        
        vertical = vertical.add(BigDecimal.ONE.negate());
        width = width.add(BigDecimal.ONE.negate());
        
        BigDecimal area = vertical.multiply(width);
        
        System.out.println(area);
    }
}