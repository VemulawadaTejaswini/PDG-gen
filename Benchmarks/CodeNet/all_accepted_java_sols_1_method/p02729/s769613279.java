import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       // int t=scanner.nextInt();
        //for(int j=0;j<t;j++){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            long ans=n*(n-1)/2+m*(m-1)/2;
            System.out.println(ans);
        //}
    }

}
