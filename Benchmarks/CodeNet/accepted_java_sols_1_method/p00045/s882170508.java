import java.util.*;
import java.math.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int count = 0;
	int sum = 0;
	double average = 0;
	while(sc.hasNext()){
	    count++;
	    String[] line = sc.next().split(",");
	    int money = Integer.parseInt(line[0]);
	    int num = Integer.parseInt(line[1]);

	    sum += money*num;
	    average += num;
	}

	average = average/count;
	BigDecimal bi = new BigDecimal(String.valueOf(average));
	average = bi.setScale(0,BigDecimal.ROUND_HALF_UP).doubleValue();

	System.out.println(sum);
	System.out.println((int)average);
    }
}