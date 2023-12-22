import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            if(ar[i]==ar[i+1]){
                count++;
                i++;
            }
        }
        System.out.println(count);
    }  
} 