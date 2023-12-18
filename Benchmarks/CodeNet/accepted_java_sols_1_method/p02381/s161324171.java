import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            double sum = 0.0, ave,x=0.0;
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            ave = sum / n;
            for(int i=0;i<n;i++){
                x += Math.pow(a[i]-ave, 2);
            }
            x /= n;
            System.out.println(Math.sqrt(x));
        }
        sc.close();
    }
}
