import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        long sum=0;
      
        int a[] = new int [sc.nextInt()];
       int max = 0;
        int min = 0;
        for(int i = 0; i<a.length; i++){
        a[i] = sc.nextInt();
        sum = sum + a[i];
        if (i == 0){
        max = a[i];
        min = a[i];
        }
        
        if(i !=0 && min>a[i]){
           min = a[i];
        }
        else if (i != 0 && max<a[i])
            max = a[i];
    }
        System.out.println( min+" "+max+ " "+ sum);
}}

