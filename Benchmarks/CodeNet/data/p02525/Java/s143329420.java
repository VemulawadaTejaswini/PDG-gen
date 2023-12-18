import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s[], n, i;
        double ave, dev;
        ave = 0;
        dev = 0;
        while(true){
            n = sc.nextInt();
            if(n == 0)break;
            s = new int[n];
            for(i = 0; i < n; i++){
                s[i] = sc.nextInt();
                ave += s[i];
            }
            ave /= i;
            for(i = 0; i < n; i++){
                dev += Math.pow(s[i] - ave, 2);
            }
            dev /= i;
            dev = Math.sqrt(dev);
            System.out.println(dev);
        }
    }
}