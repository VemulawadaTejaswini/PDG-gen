import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int pow = sc.nextInt();
        
        double num = 1;
        
        for(int i=1; i<=pow; i++){
            num = num * i % (Math.pow(10, 9) + 7);
        }
        
        int ans = (int)num; 
        System.out.println(ans);
    }
}
