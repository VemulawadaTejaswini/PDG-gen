import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        P_queue S = new P_queue();
        while(true){
            String order = sc.next();
            if(order.equals("insert"))
                S.insert(sc.nextLong());
            else if(order.equals("extract"))
                System.out.println(S.extract());
            else
                break;
        }
    }
}
class P_queue{
    long num[];
    int n = 0;
    P_queue(){
        num = new long[2000010];
    }
    void insert(long k){
        num[++n] = k;
        int i = n;
        while(i > 1){
            if(num[i/2] <= num[i]){
                long tmp = num[i/2];
                num[i/2] = num[i];
                num[i] = tmp;
                i /= 2;
            }
            else
                break;
        }
    }
    long extract(){
        long ans = num[1];
        num[1] = num[n--];
        int i = 1;
        while(true){
            int x = 2*i;
            if(2*i +1 <= n){
                if(num[x] <= num[x+1])
                    x++;
            }
            else if(2*i > n)
                break;
            if(num[i] < num[x]){
                long tmp = num[i];
                num[i] = num[x];
                num[x] = tmp;
                i = x;
            }
            else
                break;
        }
        return ans;
    }
}
