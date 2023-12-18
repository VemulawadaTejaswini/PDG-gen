import java.util.Scanner;
class Main{
	public static void main(String[] args){
    	Scanner sr = new Scanner(System.in);
      	int A = sr.nextInt();
      	int B = sr.nextInt();
      	int H = sr.nextInt();
      	int M = sr.nextInt();
      	
      double angleA = (H*60+M)*Math.PI/360;    
      double angleB = (M*Math.PI)/30;
      double C = A*A+B*B-(2*A*B*Math.cos(Math.abs(angleA-angleB)));
      System.out.println(Math.sqrt(C));
    }
} 