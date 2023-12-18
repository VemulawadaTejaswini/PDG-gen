import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double mny = 100;
        double risoku = 1.01;
            
        int cnt;    
        for(cnt=0;mny<num1;cnt++){
            long mny2 = (long)(mny*risoku);
            mny = mny2;
            }
        System.out.println(cnt);
        scan.close();
    }
}