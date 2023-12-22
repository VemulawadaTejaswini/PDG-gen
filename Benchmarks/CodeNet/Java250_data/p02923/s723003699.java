import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i=0;i<n;i++){
            h[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int count = 0;
        int maxCount = -1;
        for(int i=n-2;i>=0;i--){
            if(h[i] >= h[i+1]){
                count++;
            }else{
                if(count > maxCount){
                    maxCount = count;
                   
                }
               count = 0;
            }
        }
        maxCount = Math.max(maxCount,count);
        System.out.println(maxCount);
    }
}
