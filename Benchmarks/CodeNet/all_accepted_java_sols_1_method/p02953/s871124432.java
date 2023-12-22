import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean found = false;
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = 0;
        if(n == 1){ System.out.println("Yes");}
        if(n != 1){for(int i = 0;i < n - 1;i++){
            max = Math.max(max,arr[i]);
        }
        int maxIndex = 0;
        for(int i = 0;i < n - 1;i++){
            if(max == arr[i]){
                maxIndex = i;
                break;
            }
        }
        
        if(maxIndex == n){
            found = true;
            System.out.println("Yes");
        }
        for(int i = maxIndex + 1;;i++){
            if(i == n) {break;}
            if(max - arr[i] >= 2 ){
                System.out.println("No"); found = true;break;
                
            }
            
        }
        if(found == false){
            System.out.println("Yes");
        }
    }
    }
}