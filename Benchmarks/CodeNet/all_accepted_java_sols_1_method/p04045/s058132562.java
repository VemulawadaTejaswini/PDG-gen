import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> hatenum = new ArrayList<>();
        List<Integer> oneToTen = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        int paymoney = in.nextInt();
        int n = in.nextInt();
        int i = 0;
        while(i < n){
            hatenum.add(in.nextInt());
            i++;
        }
        oneToTen.removeAll(hatenum);
        //System.out.println(oneToTen);
        int[] ud = {1, 10, 100, 1000, 10000};
        int[] di = {0, -1, -1, -1, -1};
        while (true) {
            int total = 0;
            for(int k = 0;k < 5;k++) {
                if(di[k] != -1){
                total += ud[k] * oneToTen.get(di[k]);
                //System.out.println(total);
                }else{
                    break;
                }
                ///di[k] += 1;
                //System.out.println(total);
            }
            if(paymoney == total || paymoney < total) {
                System.out.println(total);
                break;
            }
            di[0] += 1;
            for (int k = 0;k < 5;k++) {
                if (oneToTen.size() == di[k]) {
                    di[k] = 0;
                    di[k+1] += 1;
                } else {
                    break;
                }
            }
        }
    }
}