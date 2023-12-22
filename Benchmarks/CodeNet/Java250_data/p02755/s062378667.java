import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = -1;
        for(int i = 10000; i > 0; i--){
            int tax1 = (int)(i* 0.08);
            int tax2 = (int)(i* 0.1);
            if(tax1==a && tax2==b){
                ans = i;
            }
        }
        System.out.println(ans);

    
	}
}