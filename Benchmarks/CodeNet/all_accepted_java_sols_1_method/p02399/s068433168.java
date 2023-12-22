import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] x={scan.nextInt(),scan.nextInt()};
        
        System.out.println(x[0]/x[1]+" "+x[0]%x[1]+" "+String.format("%f", 1.0*x[0]/x[1]));
    }
}
