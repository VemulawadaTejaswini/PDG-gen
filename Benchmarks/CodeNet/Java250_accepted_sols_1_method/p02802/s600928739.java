import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean ac[] = new boolean[n];
        int wanum[] = new int[n];
        for(int i = 0;i<n;i++){
            ac[i] = false;
            wanum[i] = 0;
        }for(int i = 0;i<m;i++){
            int p = sc.nextInt();
            String s = sc.next();
            if(s.equals("AC")){
                ac[p-1] = true;
            }else if(s.equals("WA") && ac[p-1] == false){
                wanum[p-1]++;
            }
        }
        int acResult = 0;
        int waResult = 0;
        for(int i = 0;i<n;i++){
            if(ac[i]){
                acResult++;
                waResult += wanum[i];
            }
        }
        System.out.print(acResult + " ");
        System.out.println(waResult);
        sc.close();
    }

}