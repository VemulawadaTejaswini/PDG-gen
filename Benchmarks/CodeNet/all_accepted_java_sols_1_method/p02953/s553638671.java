import java.util.Scanner;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
        }

        int temp = 1000000001;
        for(int i=n-1;i>-1;i--){
            int now = input[i];
            //System.out.println("temp=" + temp + " now=" + now);
            if(temp >= now){
                temp = now;
                continue;
            }else if (temp >= now-1){
                temp = now-1;
                continue;
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");



    }
}