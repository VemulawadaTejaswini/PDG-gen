import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        data[0] = sc.nextInt();
        data[1] = sc.nextInt();
        data[2] = sc.nextInt();
        data[3] = sc.nextInt();
        data[4] = sc.nextInt();
        int i;
        int max,min,sum=0;
        max = data[0]; min = data[0];
        for(i=0; i<n; i++){
            if(max < data[i]) max = data[i];
            if(min > data[i]) min = data[i];
            sum += data[i];
        }
        System.out.printf("%d %d %d\n", min, max, sum);
    }
}
