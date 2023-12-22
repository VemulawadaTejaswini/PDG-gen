import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[10000001];
        int s = sc.nextInt();
        int now = s;
        l[s]++;
        for(int i = 2;;i++){
            int tmp = 0;
            if(now % 2 == 0){
                tmp = now/2;
            }else{
                tmp = (3*now)+1;
            }
            if(l[tmp] > 0){
                System.out.println(i);
                break;
            }else{
                l[tmp]++;
                now = tmp;
            }
        }
    }
}
