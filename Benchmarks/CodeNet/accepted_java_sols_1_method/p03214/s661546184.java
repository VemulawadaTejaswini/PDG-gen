import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] array= new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            sum+=array[i];
        }
        int min=sum;
        int minnum=0;
        for (int i=0;i<n;i++){
            if (Math.abs(sum-array[i]*n)<min){
                min=Math.abs(sum-array[i]*n);
                minnum=i;
            }
        }
        System.out.println(minnum);
    }
}
