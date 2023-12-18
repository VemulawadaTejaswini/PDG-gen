import java.util.*;
import java.io.*; 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int event = sc.nextInt();
        int[] fish = new int[num];
        int[] player = new int[num];
        for(int i=0;i<num;i++){
            fish[i] = 0;
            player[i] = i+1;
        }
        for(int k=0;k<event;k++){
            int p = sc.nextInt();
            int get = sc.nextInt();
            fish[p] += get;
            for(int i=0;i<num;i++){
            for(int j=0;j<(num)-i;j++){
                // j番目とj+1番目の要素を比較して
                // j番目の方が大きかったとき、2つの要素を入れ替える
                if(fish[j]>fish[j+1]){
                    int x = fish[j];
                    int y = fish[j+1];
                    int xx = player[j];
                    int yy = player[j+1];
                    fish[j] = y;
                    fish[j+1] = x;
                    player[j] = yy;
                    player[j+1] = xx;
                }
            }
            }
            System.out.println(player[num] + " " + fish[num]);
        }
    }    
}