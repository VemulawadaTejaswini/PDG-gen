import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int temp=0;
        int[] arr={a,b,c};
        temp=arr[1];
        arr[1]=a;
        arr[0]=temp;
        temp=arr[2];
        arr[2]=arr[0];
        arr[0]=c;
        arr[0]=temp;
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }





     }
}
