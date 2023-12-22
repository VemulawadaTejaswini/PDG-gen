import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char n[] = S.toCharArray();
        
        int A = n[0] - 48;
        int B = n[1] - 48;
        int C = n[2] - 48;
        int D = n[3] - 48;
        int nums[] = {A, B, C, D};

 
        for( int i = 0; i < (1 << 3); i++ ) {
            int sum = nums[0];
            for( int j = 0; j < 3; j++ ) {
                if( (i>>j & 1) == 1 ) {
                    sum += nums[j+1];
                } else {
                    sum -= nums[j+1];
                }
            }
            
            if( sum == 7 ) {
                StringBuilder sb = new StringBuilder();
                sb.append(nums[0]);
                for( int j = 0; j < 3; j++ ) {
                    if( (i >> j & 1) == 1  ) {
                        sb.append("+");
                    } else {
                        sb.append("-");
                    }
                    sb.append(nums[j+1]);
                }
                sb.append("=7");
                System.out.println(sb.toString());
                break;
            }
        }
    }
}
