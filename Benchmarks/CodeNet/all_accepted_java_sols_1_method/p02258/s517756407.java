import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            num[i] = sc.nextInt();
        int min = num[0];
        int max = num[1] - num[0];
        for(int i = 0 ; i < n-1 ; i++){
            if(num[i] < min)
                min = num[i];
            if(num[i+1] - min > max)
                max = num[i+1] - min;
        }
        System.out.println(max);
    }
}
