import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 配列
        int n = sc.nextInt();

        int[] a = new int[n];
        ArrayList<Integer> gd = new ArrayList<>();
        ArrayList<Integer> bd = new ArrayList<>();
        Integer tmp = 0;
        for(int i=0;i<n;i++) {
            tmp = sc.nextInt();
            if(!gd.contains(tmp)){
                gd.add(tmp);
            } else if(!bd.contains(tmp)){
                bd.add(tmp);
            }
        }

        Collections.sort(gd);
        int cnt = 0;

        for(int i=0;i<gd.size();i++){
            if(bd.contains(gd.get(i))) {
                continue;
            }

            cnt++;
            for(int j=0;j<i;j++){ 
                if(gd.get(i) % gd.get(j) == 0) {
                    cnt--;
                    break;
                } 
            }
        }

        System.out.println(cnt);
    }
}
