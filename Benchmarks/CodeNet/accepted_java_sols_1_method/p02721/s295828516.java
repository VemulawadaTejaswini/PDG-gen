import java.util.*;

public class Main{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int K = sc.nextInt();
     int C = sc.nextInt();
     String str = sc.next();
     boolean[] can_work = new boolean[N];
        for(int i=0;i<N;i++){
            if(str.charAt(i)=='o'){
                can_work[i] = true;
            }else{
                can_work[i]=false;
            }
        }

        int [] first = new int[K];
        int [] last = new int[K];
        
        for(int i=0,total=0;total<K;i++){
            if(can_work[i]){
                first[total]=i;
                i+=C;
                total++;
            }
        }
        for(int i=N-1,total=0;total<K;i--){
            if(can_work[i]){
                last[total]=i;
                i-=C;
                total++;
            }
        }
        for(int i=0;i<K;i++){
            if(first[i]==last[K-1-i])
            System.out.println(first[i]+1);
        }
    }
}