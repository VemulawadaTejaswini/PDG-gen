import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        int i;
        for(i=0; i<n; i++) data[i] = sc.nextInt();
        int max,min,sum=0;
        max = data[0]; min = data[0];
        for(i=0; i<n; i++){
            if(max < data[i]) max = data[i];
            if(min > data[i]) min = data[i];
            sum += data[i];
        }
        System.out.printf("%d %d %d", min, max, sum);
    }
}
