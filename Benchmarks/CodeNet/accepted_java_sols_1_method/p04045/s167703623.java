import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt(),i,tmp,flag;
        int[] d = new int[10];
        int[] cnt = new int[10];
        for(i=0;i<10;i++)
            cnt[i]=0;
        for(i=0;i<k;i++){
            d[i] = sc.nextInt();
            cnt[d[i]]++;
        }
        for(i=n;;i++){
            tmp = i;
            flag = 1;
            for(;;){
                if(tmp==0) break;
                if(cnt[tmp%10]==1){
                    flag = 0;
                    break;
                }
                tmp/=10;
            }
            if(flag==1){
                System.out.println(i);
                break;
            }
        }
    }
}