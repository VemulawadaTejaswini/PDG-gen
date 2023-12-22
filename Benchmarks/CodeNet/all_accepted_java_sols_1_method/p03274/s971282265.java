import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n + 1];
        
        int plus;
        int zeroIndex = -1;
        int maxIndex = n + 1;
        boolean isAdd = false;
        for(int i = 0; i < n + 1; i++){
            a[i] = sc.nextInt();
            if(a[i] >= 0){
                if(isAdd == false){
                    isAdd = true;
                    a[i + 1] = a[i];
                    a[i] = 0;
                    zeroIndex = i;
                    i++;
                }
            }
            if(i == n - 1 && isAdd == false){
                i++;
                a[i] = 0;
                isAdd = true;
                zeroIndex = i;
            }
        }
        
        int start = zeroIndex - k;
        int s = 0;
        if(start < 0){
            s = 0 - start;
            start = 0;
        }
        int left = -a[start];
        int right = a[s + zeroIndex];
        
        int min = left > right ? left + right * 2 : left * 2 + right;
        
        while(true){
            start++;
            if(start > zeroIndex){
                break;
            }
            s++;
            if(zeroIndex + s > maxIndex - 1){
                break;
            }
            left = -a[start];
            right = a[s + zeroIndex];
            
            int total = left > right ? left + right * 2 : left * 2 + right;
            if(total < min){
                min = total;
            }
        }
        
        System.out.println(min);
    }
}
