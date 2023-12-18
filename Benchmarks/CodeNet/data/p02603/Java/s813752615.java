import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> num = new ArrayList<Integer>();

        long money = 1000;
        num.add(sc.nextInt());
        for(int i=0;i<n-1;i++){
            int p = sc.nextInt();
            if(num.get(num.size()-1)!=p){
                num.add(p);
            }
        }
//        System.out.println(num);
        for(int i=0;i<num.size();i++){
            int p = -1;
            int min = num.get(i);
            for(int l=i+1;l<num.size();l++){
                if(min<num.get(l)){
                    p = l;
                    break;
                }else{
                    min = num.get(l);
                }
            }
            if(p!=-1){
                money += (num.get(p)-min) * (money/min);
            }else{
                break;
            }
            i = p -1;
        }
        System.out.println(money);
    }
}