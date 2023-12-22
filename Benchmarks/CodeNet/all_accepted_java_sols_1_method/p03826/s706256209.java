import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        int numD = sc.nextInt();
        
        int sumA = numA * numB;
        int sumB = numC * numD;
        
        int ans = 0;
        
        if(sumA >= sumB){
            ans = sumA;
        }else{
            ans = sumB;
        }
        
        System.out.println(ans);
	}
}