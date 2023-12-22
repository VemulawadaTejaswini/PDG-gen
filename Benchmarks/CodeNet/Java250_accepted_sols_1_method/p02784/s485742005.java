import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int size=in.nextInt();
        int ar[]=new int[size];
        long sum=0;
        for (int i = 0; i < size; i++) {
            ar[i]=in.nextInt();
            sum=sum+ar[i];
        }
        if(sum>=num){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}