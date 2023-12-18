import java.util.Scanner;

public class Main {
	static boolean isPrime[] = new boolean[50001];
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNext()){
    		double xA = input.nextDouble();
    		double yA = input.nextDouble();
    		double xB = input.nextDouble();
    		double yB = input.nextDouble();
    		double xC = input.nextDouble();
    		double yC = input.nextDouble();
    		double xD = input.nextDouble();
    		double yD = input.nextDouble();
    		System.out.println(suityoku(xA,yA,xB,yB,xC,yC,xD,yD));
    	}
    }
    
    public static String suityoku(double xA,double yA,double xB,double yB,double xC,double yC,double xD,double yD){
    	if(((yB-yA)/(xB-xA))*((yD-yC)/(xD-xC)) == -1 || ((xB-xA) == 0 && (yD-yC) == 0) || ((xD-xC) == 0 && (yB-yA) == 0)){
    		return "YES";
    	}else{
    		return "NO";
    	}
    }
}