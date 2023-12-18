import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	double x1,x2;
	double y1,y2,result;

	x1 = in.nextDouble();
	y1 = in.nextDouble();
	x2 = in.nextDouble();
	y2 = in.nextDouble();

	result = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	System.out.printf("%.8f\n",result);
    }
}

