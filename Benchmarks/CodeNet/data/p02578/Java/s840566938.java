import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] a = new int[n];
    int sum = 0;
    
    for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
        
        if(i != 0){
            
            int count = a[i -1]  - a[i];
            if(count >= 1){
            
                a[i] = a[i] + count;
                sum = sum + count;
                     
                
            }
            
        }
        
    }
    
    System.out.println(sum);
    
    }
}