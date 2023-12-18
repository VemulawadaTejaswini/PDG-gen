import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int start;
    
    public static boolean nibutan(int array[], int start, int length, int num){
        int pos = -1;
        int lower = start; //最小index番号
        int upper = length - 1; // 最大index番号
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (array[mid] == num) {
                pos = mid;
                break;
            } else if (array[mid] < num) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        
        if(pos != -1){
            if(pos > 0){
                start = pos - 1;
            }
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a[] = new int[n];
        start = 0;
        int count = 1;
        boolean flag = true;
        a[0] = stdIn.nextInt();
        for(int i = 1; i < n; i++){ //重複しているところは配列に入れない
            int num = stdIn.nextInt();
            if(a[count - 1] != num){
                a[count++] = num;
            }
        }
        
        int m = stdIn.nextInt();
        int b[] = new int[m];
        
        for(int i = 0; i < m; i++){
            b[i] = stdIn.nextInt();
        }
        
        for(int i = 0; i < m; i++){
            flag = nibutan(a, start, count, b[i]); //左から配列、配列の長さ、探索する数字
            if(!flag){
                break;
            }
        }
        
        if(flag){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
        stdIn.close();
    }
}



