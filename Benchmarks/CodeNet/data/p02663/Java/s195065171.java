import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for(int i=0; i<5; i++){
            num[i] = sc.nextInt();
        }

        int wake = (num[2]-num[0])*60;
        int ans = wake-num[4];
        System.out.println(ans);
    }
}