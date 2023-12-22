import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] boy = new int[n+1];
        int cnt = 0;

        for(int i = 0;i<k;i++){
            int d = sc.nextInt();
            for(int j =0;j<d;j++){
                int a = sc.nextInt();
                boy[a-1] =1;
                }
            }

        
        for(int i = 0;i<n;i++){
            if(boy[i]==0){
                cnt++;
                //System.out.println(i+"num");
            }
        }

        System.out.println(cnt);
        
        
    }
}