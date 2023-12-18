import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] a = new int[n];
        long sum = 0;
        
        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }
        
        int max = a[0];
        int min = a[0];
        
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            if(max < a[i])
            max = a[i];
            if(min > a[i])
            min = a[i];
        }
        System.out.printf("%d %d %d\n", min,max,sum);
    }
}
