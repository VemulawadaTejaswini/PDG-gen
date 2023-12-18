import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for(int i = 0;i<n;i++){
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        int count = d[(n-1)/2+1]-d[(n-1)/2];
        System.out.println(count);
    }
}