import java.util.Scanner;                                                                                                   
public class Main {                                                                                                         
                                                                                                                            
	public static void main(String[] args) {                                                                                
		Scanner scan = new Scanner(System.in);                                                                              
		double r = scan.nextDouble();                                                                                       
		double area = r * r * Math.PI;                                                                                      
		double cf = r * 2 * Math.PI;                                                                                        
		                                                                                                                    
		System.out.print(String.format("%.6f ",area));                                                                      
		System.out.println(String.format("%.6f",cf));                                                                       
	}                                                                                                                       
}                                                                                                                           
