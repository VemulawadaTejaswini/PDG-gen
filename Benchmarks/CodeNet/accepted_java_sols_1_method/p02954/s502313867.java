import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList retu = new ArrayList<Integer>();
        for (int i = 0;i<s.length()-1;i++){
            String sub = s.substring(i,i+2);
            if (sub.equals("RL")){
                retu.add(i);
            }
        }
        retu.add(-100);
        int sks = 0;
        int[] ba = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            if(i==(int)retu.get(sks)){
                ba[i] = i;
            }else if(i==((int)retu.get(sks)+1)){
                ba[i] = i;
                sks++;
            }else if(s.charAt(i)=='R'){
                int kari = (int)retu.get(sks) - i;
                if(kari%2 == 0){
                    ba[i] = i + kari;
                }else{
                    ba[i] = i + kari + 1;
                }
            }else{
                int kari = i - (int)retu.get(sks-1);
                if(kari%2 == 0){
                    ba[i] = i - kari;
                }else{
                    ba[i] = i - kari + 1;
                }
            }
        }
        int[] result = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            result[i] = 0;
        }
        for(int i = 0;i<s.length();i++){
            int kari = ba[i];
            result[kari] += 1;
        }
        for(int i = 0;i<s.length();i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}