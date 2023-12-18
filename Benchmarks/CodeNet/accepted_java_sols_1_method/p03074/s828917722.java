import java.util.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        int max = 0;
        int sum = 0;
        int a = 0;
        int x = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);

        for(int i=0; i<N; i++){
            if(i!=N-1){
                if(S.charAt(i)=='0' && S.charAt(i+1)=='1'){
                    sum += 1;
                    a += 1;
                    list.add(i + 1);
                }
                else{
                    sum += 1;
                }
                if(a==K && S.charAt(i)=='1' && S.charAt(i+1)=='0'){
                    max = Math.max(max, sum);
                    sum -= list.get(x) - list.get(x - 1);
                    x += 1;
                    a -= 1;
                }
            }
            else if(i==N-1){
                sum += 1;
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}