import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.printf("%d",arr[0]);
        
        for(int i=1;i<n;i++){
            System.out.printf(" %d",arr[i]);
        }
    }
}