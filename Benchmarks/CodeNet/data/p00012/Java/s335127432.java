import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNextDouble()){
    		double x1 = input.nextDouble();
    		double y1 = input.nextDouble();
    		double x2 = input.nextDouble();
    		double y2 = input.nextDouble();
    		double x3 = input.nextDouble();
    		double y3 = input.nextDouble();
    		double x4 = (x1+x2+x3)/3.0;
    		double y4 = (y1+y2+y3)/3.0;
    		double px = input.nextDouble();
    		double py = input.nextDouble();
    		if(notintersect(x1,y1,x2,y2,x4,y4,px,py) && notintersect(x2,y2,x3,y3,x4,y4,px,py) && notintersect(x3,y3,x1,y1,x4,y4,px,py)){
    			System.out.println("YES");
    		}else{
    			System.out.println("NO");
    		}
    	}
    }
    
    static boolean notintersect(double x1,double y1,double x2, double y2,double x3, double y3, double x4,double y4){
    	return (((x1 - x2) * (y3 - y1) + (y1 - y2) * (x1 - x3))*((x1 - x2) * (y4 - y1) + (y1 - y2) * (x1 - x4)) > 0);
    }
}