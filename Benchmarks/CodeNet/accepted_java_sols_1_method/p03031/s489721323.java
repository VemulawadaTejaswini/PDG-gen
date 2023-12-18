import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] light = new int[m];
        for(int i = 0; i < m; i++){
            int k = Integer.parseInt(sc.next());
            for(int j = 0; j < k; j++){
                int s = Integer.parseInt(sc.next());
                light[i] |= (1 << s-1);
            }
        }
        int[] p = new int[m];
        for(int i = 0; i < m; i++){
            p[i] = Integer.parseInt(sc.next());
        }
        
        int count = 0;
        for(int i = 0; i < Math.pow(2, n); i++){
            boolean allLightUp = true;
            for(int j = 0; j < m; j++){
                if((Integer.bitCount(light[j] & i) % 2) != p[j]){
                    allLightUp = false;
                    break;
                }
            }
            if(allLightUp){
                count++;
            }
        }
        
        System.out.println(count);
    }
}