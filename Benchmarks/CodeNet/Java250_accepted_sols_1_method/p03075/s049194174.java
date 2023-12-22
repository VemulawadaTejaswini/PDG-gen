import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int[] antena = new int[5];
      	
      	for(int i = 0; i < 5; i++) {
        	antena[i] = sc.nextInt();
        }
      	int maxDis = sc.nextInt();
      	String res = "Yay!";
      	for(int i = antena.length -1; i >= 0; i--) {
        	for(int j = antena.length - 2; j >= 0; j--) {
            	 if(antena[i] - antena[j] > maxDis) {
                 	res = ":(";
                 } 
            }
        }
      	System.out.println(res);
    }
}