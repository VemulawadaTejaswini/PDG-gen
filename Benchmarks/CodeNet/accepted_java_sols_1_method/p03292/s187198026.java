import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] ar=new int[3];
        ar[0]=sc.nextInt();
        ar[1]=sc.nextInt();
        ar[2]=sc.nextInt();
        Arrays.sort(ar);
        int diff=0;
        diff=ar[1]-ar[0];
        diff+=ar[2]-ar[1];
        System.out.println(diff);
    }
}