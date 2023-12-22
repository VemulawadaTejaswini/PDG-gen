import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());
        int data[] = new int[n];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            data[i] = l + i;
            sum += data[i];
            if(Math.abs(min) > Math.abs(data[i])){
                min = data[i];
            }
        }
        System.out.println(sum - min);
    }
}