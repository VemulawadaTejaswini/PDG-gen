import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        long ratio = 100000/1000;
        int n = new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            ratio = (long) Math.ceil(ratio*1.05);
        }
        System.out.println("" + (ratio*1000));
    }
}