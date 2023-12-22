import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        int maxCount = 0;
        int result = 1;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1;i <= n; i++){
            int count = 0;
            int currentNum = i;
            
            while(true){
                if (currentNum % 2 == 0) {
                    currentNum = currentNum / 2;
                    count++;
                } else {
                    break;
                }
                
            }

            if (count > maxCount) {
                maxCount = count;
                result = i;
            }
        }
        
        System.out.println(result);
        
        sc.close();
    }
}