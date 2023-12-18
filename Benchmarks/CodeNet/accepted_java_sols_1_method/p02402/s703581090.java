import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int min = 0, max = 0, i;
        long sum = 0;
        int [] num = new int[n];
        
        for(i = 0; i < n; i++){
            num[i] = sc.nextInt();
            sum += num[i];
        }
        min = num[0];
        max = num[0];
        for(i = 0;i<n;i++){
            if(min > num[i]) min = num[i];
            if(max < num[i]) max = num[i];
        }
        System.out.println(min+" "+max+" "+sum);
    }
}
