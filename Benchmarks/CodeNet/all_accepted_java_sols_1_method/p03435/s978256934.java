import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int [][] c = new int [3][3];
    	
    	for(int i=0; i<3; i++){
    	    for(int j =0; j<3; j++){
    	        c[i][j] = sc.nextInt();
    	    }
    	}
    	
    	int a1 =0;
    	
    	int b1 = c[0][0] - a1;
    	int b2 = c[0][1] - a1;
    	int b3 = c[0][2] - a1;
    	int a2 = c[1][0] - b1;
    	int a3 = c[2][0] - b1;
    	
    	if(a2+b2 == c[1][1] && a2 + b3 == c[1][2] && a3 + b2 == c[2][1] && a3 + b3 ==c[2][2]){
    	    System.out.println("Yes");
    	}
    	
    	else{
    	    System.out.println("No");
    	}
    }
}