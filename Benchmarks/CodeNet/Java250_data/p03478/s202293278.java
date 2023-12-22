import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        
        int N = Integer.parseInt(line[0]);
        int A = Integer.parseInt(line[1]);
        int B = Integer.parseInt(line[2]);
    
        int ans = 0;
        for(int i =1;i <= N;i++){
            int result = targetInt(i);
            if (result >= A && result <= B){
                ans += i;
            }
        }
        
    System.out.println(ans);
    }


    public static int targetInt(int n){
        
        if(n == 0){
            return 0;
        }
        
        int result = n % 10;
    
        return result + targetInt(n / 10);	
    }
}