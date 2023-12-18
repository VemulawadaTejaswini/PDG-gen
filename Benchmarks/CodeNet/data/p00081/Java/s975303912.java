import java.util.Scanner;

//A Symmetric Point
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] s = sc.next().split(",");
			double x1 = Double.parseDouble(s[0]);
			double y1 = Double.parseDouble(s[1]);
			double x2 = Double.parseDouble(s[2]);
			double y2 = Double.parseDouble(s[3]);
			double x3 = Double.parseDouble(s[4]);
			double y3 = Double.parseDouble(s[5]);
			if(x1==x2){
				x3 = x3+(x1-x3)*2;
				System.out.println(x3+" "+y3);
			}
			else if(y1==y2){
				y3 = y3+(y1-y3)*2;
				System.out.println(x3+" "+y3);
			}
			else{
				double alpha = (y1-y2)/(x1-x2);
				double beta = y1-x1*alpha;
				double x = (2*y3*alpha-2*alpha*beta+x3-alpha*alpha*x3)/(alpha*alpha+1);
				double y = (x3-x)/alpha+y3;
				System.out.println(x+" "+y);
			}
		}
	}
}