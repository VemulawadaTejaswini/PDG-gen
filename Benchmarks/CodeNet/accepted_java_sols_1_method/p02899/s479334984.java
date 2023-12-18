import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int seats[] = new int[n];
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
            seats[i]=s.nextInt();
        for(int i=0;i<n;i++)
            nums[seats[i]-1]=i+1;
        for(int i:nums)
            System.out.print(i+" ");
    }
}