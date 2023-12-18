import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		double max=0;
        double min=99999999;
        while(in.hasNext()){
            double h=in.nextDouble();
            max = Math.max(max, h);
            min = Math.min(min, h);
        }
        System.out.println(max-min);
	}
	
}