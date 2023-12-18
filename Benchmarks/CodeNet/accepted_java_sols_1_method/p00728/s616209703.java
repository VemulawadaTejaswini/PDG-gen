import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int judge[], i, n, max, min, ave;
        Scanner sc = new Scanner(System.in);
        while(true){
            n = sc.nextInt();
            if(n == 0)break;
            judge = new int[n];
            ave = 0;
            max = -1;
            min = 1001;
            for(i = 0; i < n; i++){
                judge[i] = sc.nextInt();
                if(judge[i] > max) max = judge[i];
                if(judge[i] < min) min = judge[i];
                ave += judge[i];
            }
            ave -= (max + min);
            ave /= i - 2;
            System.out.println(ave);
        }
    }
}