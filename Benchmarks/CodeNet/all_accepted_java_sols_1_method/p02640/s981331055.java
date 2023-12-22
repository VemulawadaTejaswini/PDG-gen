import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int numX = sc.nextInt();
		int numY = sc.nextInt();
		
        int numC = (2 * numX) - (numY / 2);
	    int numT = numX - numC;
		
		if ((numX == numC + numT) && (numY == 2 * numC + 4 * numT)) {
		    if ((numC < 0) || (numT < 0)) {
		        System.out.println("No");
		    }else if (((numC > 0) && (numC < 1)) || ((numT > 0) && (numT < 1))) {
		        System.out.println("No");
		    } else if ((numC >= 0) && (numT >= 0)) {
		        System.out.println("Yes");
		    } else {
		        System.out.println("No");
		    }
		} else {
		    System.out.println("No");
		}
		
	}
}