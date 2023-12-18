import java.util.*;

public class Main {
    public static void sort(int array[], int array2[], int left, int right){
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
                    
                    int tmp2 = array2[l];
                    array2[l] = array2[r];
                    array2[r] = tmp2;
                    l++;
                    r--;
                }
            }
            Main.sort(array, array2, left, r);
            Main.sort(array, array2, l, right);
        }
    }
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int c[] = new int[26];
        int s[][] = new int[n][26];
        int ind[] = new int[26];
        
        for(int i = 0; i < 26; i++){
            c[i] = stdIn.nextInt();
            ind[i] = i;
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 26; j++){
                s[i][j] = stdIn.nextInt();
            }
        }
        
        Main.sort(c, ind, 0, 25);
        
        int rev[] = new int[26];
        
        for(int i = 25; i >= 0; i--){
            rev[i] = ind[25 - i] + 1;
        }
        
        for(int i = 0; i < n; i++){
            System.out.println(rev[i % 26]);
            
        }

        //System.out.println("XXXXXXXX");
    }
}
