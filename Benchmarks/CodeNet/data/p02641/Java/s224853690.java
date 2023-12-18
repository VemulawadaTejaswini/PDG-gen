import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        if(N==0){
            System.out.println(X);
            System.exit(0);
        }
        int num[] = new int[N];

        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(num);
        int candi = 0;
        int ans = 0;
        int sa = 100;
        List<Integer> list = new ArrayList<Integer>();
        int flag = 0;
        for(int i=1; i<=100; i++){
            if(num[flag] == i){
              flag ++;
              if(flag == N){
                flag --;
              }
            }else {
                list.add(i);
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0;j<list.size(); j++) {
              //System.out.println(list.get(j);
                if (num[i] != list.get(j)) {
                    candi = Math.abs(X - list.get(j));
                    //System.out.println(num[i]+"番目:6-"+list.get(j)+"="+candi);
                    if (sa > candi && candi != 0) {
                        ans = list.get(j);
                        sa = candi;
                        //System.out.println("answer:"+ans+" candi" + candi);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
