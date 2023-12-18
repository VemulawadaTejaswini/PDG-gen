import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            if(a[i]%4==0){
                count1++;
            }else if(a[i]%4!=0 && a[i]%2==0){
                count2++;
            }
        }
        if(count2%2==0){
            N = N-count2;
        }else{
            N = N-count2+1;
        }
        if(count1 >= N/2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //System.out.println(count1+":"+N);
    }
}