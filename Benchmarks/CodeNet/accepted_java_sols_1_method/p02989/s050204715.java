 
 
import java.util.Arrays;
import java.util.Scanner;

 class Main{
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i <n ;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        int x = arr[n/2] - arr[n/2 -1] ;
        System.out.println(x);
    }
    
}
