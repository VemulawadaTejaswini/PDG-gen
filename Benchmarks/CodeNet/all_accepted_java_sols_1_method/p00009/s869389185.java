import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        
        while(true) {
            int count = 0;
            try {
                line = sc.nextLine();
            }catch(Exception e) {
                break;
            }
            int n = Integer.parseInt(line);
            for(int num = 1; num <= n; num++) {
                if (num < 2) {
                    continue;
                }else if (num == 2) {
                    count++;
                    continue;
                }else if (num % 2 == 0) {
                    continue; // 偶数はあらかじめ除く
                }
                double sqrtNum = Math.sqrt(num);
                boolean sosuu = true;
                for (int i = 3; i <= sqrtNum; i += 2) {
                    if (num % i == 0) {
                        sosuu = false;
                        break;
                    }
                }
                if(sosuu) {
                    count++;
                }
                    
            }
            System.out.println(count);
        }
        
    }
 } 
