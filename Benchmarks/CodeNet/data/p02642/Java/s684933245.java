import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int a[] = new int[n];
        int waren[] = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
        }
        
        Arrays.sort(a);
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
        
        for(int j = 0; j < counter; j++){
            //System.out.println(waren[j]);
        }
        
        System.out.println(counter - samNum);
        
    }
}
