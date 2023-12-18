import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n+1];
        for(int i = 0; i < k; i++){
            int d = scanner.nextInt();
            for(int j = 0; j < d; j++){
                int num = scanner.nextInt();
                a[num]++;
            }
        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(a[i] == 0){count++;}
        }
        System.out.println(count);
    }
}