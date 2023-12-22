import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int length = S.length();
        int g1 = 0;
        int g2 = 0;
        int gcnt = 0;
        char now = 'L';
        int rInd = 0;
        int V[] = new int[length];
        for(int i = 0; i < length; i++){
            V[i] = 0;
        }
        for(int i = 0; i < length; i++){
            char c = S.charAt(i);
            if(now != c){
                if(c == 'L'){
                    rInd = i - 1;
                    if(gcnt % 2 == 0){
                        V[i] = g1;
                        V[i - 1] = g2;
                    }else{
                        V[i] = g2;
                        V[i - 1] = g1;
                    }
                }
                now = c;
                g1 = 0;
                g2 = 0;
                gcnt = 0;
            }
            gcnt++;
            if(c == 'R'){
                if(gcnt % 2 != 0){
                    g1++;
                }else{
                    g2++;
                }
            }else{
                if(gcnt % 2 != 0){
                    V[rInd + 1]++;
                }else{
                    V[rInd]++;
                }
            }
        }
        for(int i = 0; i < length; i++){
            System.out.print(V[i] + " ");
        }
        System.out.println();
    }
}
