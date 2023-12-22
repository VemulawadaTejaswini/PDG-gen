import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input N K d1 A11,A12,...,A1d1 d2 ... AKdK
        // Aij の割当がない番号の個数を出力せよ
        Scanner sc = new Scanner(System.in);
        int sunukeNum = sc.nextInt();
        int sweetsNum = sc.nextInt();
        List<Integer> hasSweetsSunuke = new ArrayList<>();
        for(int i = 0; i < sunukeNum; i++){
            hasSweetsSunuke.add(0);
        }
        int trickNum = sunukeNum;
        for(int i = 0; i < sweetsNum; i++){
            int sweetsNo = sc.nextInt();
            for(int j = 0; j < sweetsNo; j++){
                int sunukeNo = sc.nextInt()-1;
                if(hasSweetsSunuke.get(sunukeNo) == 0){
                    hasSweetsSunuke.set(sunukeNo, 1);
                    trickNum--;
                }
            }
            if(trickNum == 0){
                System.out.println(0);
                return;
            }
        }
        System.out.println(trickNum);
    }
}