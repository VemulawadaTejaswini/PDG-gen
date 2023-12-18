import java.util.Scanner;

public class Main {
    private static int debit=100000;
    private static final double rate=1.05;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            debit*=rate;
            if(debit%1000>0){
                debit/=1000;
                debit=(debit+1)*1000;
            }
        }
        System.out.println(debit);
    }
}