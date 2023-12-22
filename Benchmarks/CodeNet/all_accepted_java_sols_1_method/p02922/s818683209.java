import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
      	double b = sc.nextDouble();
        int o=0;
        o=(int)Math.ceil((b-1)/(a-1));
        System.out.println(o);
    }
}