import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int a[] =new int[N];
        
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        
        int num =0;
        
        for(int i=0;i<N-2;i++){
            if(a[i]<a[i+1] && a[i+1]<a[i+2] || a[i]>a[i+1]&&a[i+1]>a[i+2]){
                num +=1;
            }
        }
        System.out.println(num);
        
    }
}
