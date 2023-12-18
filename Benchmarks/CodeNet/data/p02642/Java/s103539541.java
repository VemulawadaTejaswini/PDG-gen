import java.util.*;

public class Main {
    public static void sort(int array[], int left, int right){
        if(left <= right){
            int p = array[(left + right) >>> 1];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l++;
                }
                while (array[r] > p){
                    r--;
                }
                if (l <= r){
                    int tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    l++;
                    r--;
                }
            }
            Main.sort(array, left, r);
            Main.sort(array, l, right);
        }
    }
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int a[] = new int[n];
        int waren[] = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
        }
        
        Main.sort(a, 0, n - 1);
        
        int counter = 0;
        int samNum = 0;
        
        for(int i = 0; i < n; i++){
            boolean warenFlag = true;
            boolean samFlag = false;
            
            if(i != n - 1){
                if(a[i] == a[i + 1]){
                    samFlag = true;
                }
            }
            
            if(i != 0){
                if(a[i - 1] == a[i]){
                    samFlag = true;
                }
            }
            
            for(int j = 0; j < counter; j++){
                if(a[i] / 2 < waren[j]){
                    break;
                }
                if(a[i] % waren[j] == 0){
                    warenFlag = false;
                    break;
                }
            }
                
            if(warenFlag){
                waren[counter] = a[i];
                counter++;
                if(samFlag){
                    samNum++;
                }
            }
        }
        
        System.out.println(counter - samNum);
        
    }
}
