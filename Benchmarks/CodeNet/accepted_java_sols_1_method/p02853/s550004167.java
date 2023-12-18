import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x,y;
        x=scan.nextInt();
        y=scan.nextInt();
        if(x>=4) x=0;
        if(y>=4) y=0;
        int[] arr = {0,300000,200000,100000};
        if(x==1&&y==1) System.out.println(arr[x]+arr[y]+400000);
        else System.out.println(arr[x]+arr[y]);
    }
}