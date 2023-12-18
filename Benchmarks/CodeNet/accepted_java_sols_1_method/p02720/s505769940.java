import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();

        if(k < 10){
            System.out.println(k);
            return;
        }
        Queue<Long> que = new ArrayDeque<>();
        for(long i = 1; i <= 9; i++){
            que.add(i);
        }

        int cnt = 9;
        while(cnt < k){
            long num = que.poll();
            long ldig = num % 10;
            if(ldig == 0){
                que.add(num * 10);
                que.add(num * 10 + 1);
                cnt += 2;
            }else if(ldig == 9){
                que.add(num * 10 + 8);
                que.add(num * 10 + 9);
                cnt += 2;
            }else{
                que.add(num * 10 + ldig - 1);
                que.add(num * 10 + ldig);
                que.add(num * 10 + ldig + 1);
                cnt += 3;
            }
        }

        long out = 0;
        for(int i = que.size(); i > cnt - k; i--){
            out = que.poll();
        }
        System.out.println(out);
    }
}