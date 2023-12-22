import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n+1];
        int max = 0;
        for(int i = 0; i < n; i++){
            h[i] = scanner.nextInt();
            max = Math.max(max, h[i]);
        }
        int count = 0;
        for(int i = 1; i <= max; i++){
            for(int j = 0; j < n; j++){
                if(h[j] >= i && h[j+1] < i){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}