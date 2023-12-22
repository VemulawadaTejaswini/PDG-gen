import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        int[] arr=new int[m];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        if(sum<=n) {
            System.out.println(n - sum);
        }else {
            System.out.println(-1);
        }








    }
}



