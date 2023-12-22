import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int res = 0;

        for(int i=1; i<=n; i++){
            int sum = 0;
            for(char c : String.valueOf(i).toCharArray()){
                sum += Character.getNumericValue(c);
                if(sum > b) break;
            }
            if(a <= sum && b >= sum) res+=i;
            
        }
        System.out.println(res);
        scan.close();
        
    }
}