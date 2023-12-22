import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int[] a = new int[t];

        for(int i=0;i<t;i++){
            a[i] = scan.nextInt();
        }

        while(t-->0){
            if(t==0){
                System.out.print(a[t]);
            }else{
            System.out.print(a[t] + " ");
            }
        }
        System.out.println();
    }
}
