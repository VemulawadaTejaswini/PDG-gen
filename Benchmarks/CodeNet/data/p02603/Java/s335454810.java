import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = Integer.parseInt(sn.next());
        int money = 1000; // 残高
        int tmpMin = 0; 
        ArrayList<Integer> stateList = new ArrayList<Integer>();
        boolean flg = true;
        
        for ( int i = 0; i < n; i++){
            stateList.add(Integer.parseInt(sn.next()));
        }
        tmpMin = stateList.get(0);
        
        for ( int i2 = 1; i2 < n; i2++){
            if (tmpMin < stateList.get(i2)){
                money = ((money / tmpMin) * stateList.get(i2)) + (money % tmpMin);
                tmpMin = stateList.get(i2);
                flg = false;
            } else if (tmpMin > stateList.get(i2)){
                tmpMin = stateList.get(i2);
            }
        }
        if (flg){
            System.out.println(1000);
        }else{
            System.out.println(money);
        }
    }
}
