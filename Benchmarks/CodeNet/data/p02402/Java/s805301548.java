import java.util.Scanner;

public class Main{
    
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max)    max = arr[i];
            if(arr[i] < min)    min = arr[i];
        }
        System.out.println(min+" "+max+" "+sum);
        
        
    }
}
