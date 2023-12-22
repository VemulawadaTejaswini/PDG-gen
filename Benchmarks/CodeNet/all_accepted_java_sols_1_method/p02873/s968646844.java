import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int n = s.length() +1;
        int[] a = new int[n];
        
        int j = 0;
        int x = 1;
        while(j < n-1){
            if(s.charAt(j) == '<'){
                a[j+1] = x;
                x++;
            }else{
                x = 1;
            }
            j++;
        }
        
        j = n-2;
        x = 1;
        while(j >= 0){
            if(s.charAt(j) == '>'){
                if(a[j] < x){
                    a[j] = x;
                    x++;
                }
            }else{
                x = 1;
            }
            j--;
        }
        
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += a[i];
        }
        
        System.out.println(ans);
    }
}