import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n  = sc.nextInt();
        int[] array = new int[n];
        int min = 0;
        int temp = 0;
        int swapCount = 0;
        int j = 0;
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            min = i;
            for(j=i+1;j<n;j++){
                if(array[j] < array[min]){
                    min = j;
                }
             }
            if(min != i){
                swapCount++;
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]);
            if(i<n-1){
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.println(swapCount);
        sc.close();
    }
}
