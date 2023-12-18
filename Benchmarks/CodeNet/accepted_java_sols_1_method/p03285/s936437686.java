import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Boolean flag = false;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        out_of_loop:
        for (int i = 0; ; i++){

			if (4 * i > n)break;
          
            for (int j = 0; ; j++){
                int sum = 4 * i + 7 * j;
                
                if (sum > n)break;
                
                if (sum == n){
                    flag = true;
                    break out_of_loop;
                }
            }
        }
        
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        sc.close();
    }
}

