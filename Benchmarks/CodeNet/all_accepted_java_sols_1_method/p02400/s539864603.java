import java.util.*;

public class Main {
public static void main(String[] args) throws Exception {
    	 Scanner sc = new Scanner(System.in);
    	 double r = sc.nextDouble();
    	 System.out.print(String.format("%.6f",r*r*Math.PI));
    	 System.out.print(" ");
    	 System.out.println(String.format("%.6f",r*(Math.PI*2)));
     }
}

