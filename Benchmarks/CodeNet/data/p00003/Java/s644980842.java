import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
 
class Main {
 
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        String[] num1 = null;
 
        try {
 
 
        while ((str = br.readLine()) !=null) {
 
 
         num1 = str.split(" ");
 
        BigDecimal[] array = new BigDecimal[num1.length] ;
 
 
        for(int i=0; i<num1.length; i++){
            array[i] = new BigDecimal(num1[i]);
        }
 
        BigDecimal tmp = array[3].divide(array[0]);
 
        array[1] = array[1].multiply(tmp);  array[2] = array[2].multiply(tmp);
 
        BigDecimal y = (array[2].subtract(array[5])).divide(array[1].subtract(array[4]));
 
        BigDecimal x= array[5].subtract(array[4].multiply(y)).divide(array[3]);
 
        System.out.println(x.setScale(3, RoundingMode.HALF_UP)+" "+y.setScale(3, RoundingMode.HALF_UP));
 
        }
 
        } catch (Exception e) {
            // TODO: handle exception
        }
 
 
    }
 
}