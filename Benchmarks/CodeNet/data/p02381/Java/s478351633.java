import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            int data[] = new int[n];
            double ave = 0,dev = 0;
            for (i=0;i<n;i++) {
                data[i] = sc.nextInt();
                ave += data[i];
            }
            ave /= n;
            for (i=0;i<n;i++) {
                dev += (data[i] - ave)*(data[i] - ave);
            }
            dev = Math.sqrt(dev/n);
            System.out.println(dev);
        }
    }
}

