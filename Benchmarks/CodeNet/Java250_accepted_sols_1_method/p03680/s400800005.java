import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n+1];
        boolean flag  = false;
        int cnt = 0;
        int num = 1;

        for(int i =1;i<n+1;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i =0;i<n;i++){
            if(a[num]==2){
                cnt++;
                flag=true;
                break;
            }else{
                num=a[num];
                cnt++;
            }   
     
        }

        if(flag){
            System.out.println(cnt);
        }else{
            System.out.println(-1);
        }

        
    }
}




