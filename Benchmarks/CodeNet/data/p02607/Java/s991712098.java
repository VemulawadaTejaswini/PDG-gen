import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int test=in.nextInt();
        int ar[]=new int[test];
        int count=0;
        for (int i = 0; i <test; i++) {
            ar[i]=in.nextInt();
            if(i%2==0 && ar[i]%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}