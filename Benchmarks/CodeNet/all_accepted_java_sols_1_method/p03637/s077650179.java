import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int count2 = 0;
        int count4 = 0;
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            if(a[i] % 4 == 0)
                count4++;
            else{
                if(a[i] % 2 == 0)
                    count2++;
            }    
        }
        sc.close();

        if(count4 > 0 && 2*count4+1 >= N){
            System.out.println("Yes");
            return;
        }
        if(count2 == N){
            System.out.println("Yes");
            return;
        }
        if(count2 > 1 && count4 > 0 && (2*count4+count2 >= N)){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
        
    }
}