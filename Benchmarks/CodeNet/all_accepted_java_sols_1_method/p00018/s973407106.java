import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        a[0]=s.nextInt();a[1]=s.nextInt();a[2]=s.nextInt();
        a[3]=s.nextInt();a[4]=s.nextInt();
        Arrays.sort(a);
        System.out.printf("%d %d %d %d %d\n",a[4],a[3],a[2],a[1],a[0]);
    }
}