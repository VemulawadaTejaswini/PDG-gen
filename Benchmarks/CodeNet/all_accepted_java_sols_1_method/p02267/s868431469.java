import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        int count = 0;
        
        int n = scan.nextInt();
        
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        
        int m = scan.nextInt();
        
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = scan.nextInt();
            for(int j = 0; j < n; j++){
                if(b[i] == a[j]){
                    count++;
                    break;
                }
            }
        }
        
        System.out.println(count);
        
        scan.close();
    }
}

