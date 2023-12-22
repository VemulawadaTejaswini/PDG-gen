import java.util.*;

public class Main
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int arr = 0;
        for(int i = 0;i<N;i++)arr+=sc.nextInt();
        if(H <= arr){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}