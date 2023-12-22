import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
              Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {

            //7
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            int aa[] = new int[a];
            int sum = 0;
            for (int i = 0; i < a; i++) {
                aa[i] = sc.nextInt();
                
                sum += aa[i];
            }
           
                int av = sum / a;
            

            int answer=0;
            for (int k = 0; k < a; k++) {
                if (aa[k] <= av) {
                    answer++;
                }
            }
            System.out.println(answer);


        }
    }
}
