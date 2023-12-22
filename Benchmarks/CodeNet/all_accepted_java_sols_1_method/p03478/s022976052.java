import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int result = 0;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i=1; i<=n; i++){
            int sum = 0;
            String str = Integer.toString(i);
            String []resultArray = str.split("");
            
            for(int j = 0; j < resultArray.length; j++){
                int num=Integer.parseInt(resultArray[j]);
                sum += num;
            }
            
            if(a <= sum && sum <= b){
                result += i;
            }
            
        }

        System.out.println(result);
        sc.close();
    }
}
