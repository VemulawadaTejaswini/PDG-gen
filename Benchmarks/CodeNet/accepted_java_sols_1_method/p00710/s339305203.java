import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[50];
        int[] temp = new int[50];
        
        while(true){
            int n;
            if((n=sc.nextInt())==0) break;
            int r=sc.nextInt();
            for(int i=0;i<n;i++) nums[i]=n-i;
            for(int i=0;i<r;i++){
                int p=sc.nextInt();
                int c=sc.nextInt();
                for (int j=0;j<p-1;j++) temp[j] = nums[j];
                for (int j=0;j<c;j++) nums[j] = nums[j+p-1];
                for (int j=0;j<p-1;j++) nums[c+j] = temp[j];
            }
            System.out.println(nums[0]);
        }
    }
}