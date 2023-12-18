import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s[], n, i;
        double ave, dev;
        while(true){
            n = sc.nextInt();
            if(n == 0) break;
            s = new int[n];
            ave = 0;
            dev = 0;
            for(i = 0; i < n; i++){
                s[i] = sc.nextInt();
                ave += s[i];
            }
            ave /= i;
            for(i = 0; i < n; i++){
                dev += Math.pow(s[i] - ave, 2);
            }
            dev /= i;
            System.out.println(Math.sqrt(dev));
        }
    }
}