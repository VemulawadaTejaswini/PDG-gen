import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dish = new int[5];
        for(int i = 0;i<dish.length;i++)dish[i]=sc.nextInt();
        int ans = 0;
        int max=0;
        for(int i = 0;i<dish.length;i++){
            int tmp = dish[i];
            while(tmp%10!=0){
                tmp++;
            }
            if(max<tmp-dish[i])max=tmp-dish[i];
            ans+=tmp;
        }
        System.out.println(ans-max);
    }
}
