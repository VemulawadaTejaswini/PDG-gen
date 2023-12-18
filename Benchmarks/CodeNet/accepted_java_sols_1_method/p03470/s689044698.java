import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int count = 0;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mochiArray[] = new int[n];
        
        for (int i=0; i < n; i++){
            int scale = sc.nextInt();
            boolean exist = true;
            
            for (int mochi : mochiArray) {
                if (mochi == scale) {
                    exist = false;
                    break;
                }
            }
            if (exist) count++;
            mochiArray[i] = scale;
        }
        
        System.out.println(count);
        sc.close();
    }
}
