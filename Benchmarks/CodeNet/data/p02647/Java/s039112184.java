import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] array = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < k; i++){
            for(int j = 0; j < n; j++){
                int sta = (int)((j+1) - array[j] - 0.5);
                int end = (int)((j+1) + array[j] + 0.5);
                if(sta < 0){
                    sta = 0;
                }
                
                for(int m = sta; m < end; m++){
                    try{
                        result[m]++;
                    }catch(ArrayIndexOutOfBoundsException e){

                    }
                }
                
                array[j] = result[j];
            }
            for(int j = 0; j < n; j++){
                array[j] = result[j];
                result[j] = 0;
            }

        }
        for(int m : array){
            System.out.print(m + " ");
        }
    }
}
