import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int haku = sc.nextInt();
        int fs = sc.nextInt();
        int fsm = sc.nextInt();
        int nxm = sc.nextInt();
        
        int money = 0;
        
        for(int i=1;i<=haku;i++){
            if(i <= fs){
                money += fsm;
            }else{
                money += nxm;
            }
        }
        System.out.println(money);
    }
}