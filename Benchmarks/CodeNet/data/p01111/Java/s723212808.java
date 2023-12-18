
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
        Main m = new Main();
        m.run();
    }

    void run(){
        for(;;){
            long n = sc.nextInt();

            if(n ==0 ){
                break;
            }

            PriorityQueue<Long> mod = new PriorityQueue<Long>((l1,l2)->Long.compare(l2,l1));

            for(long i = 1 ;i*i <= 2*n;i++){
                if((n*2) % i ==0){
                    mod.add(i);
                    mod.add((n*2)/i);
                }
            }

            for(;;){
                long width = mod.poll();
                long center = n / width;
                long from = center - (width-1)/2 ;
                long to = from + width-1;

                if(n == (from + to) * width / 2 && from > 0){
                    System.out.println(from + " "+ width);
                    break;
                }

            }


        }

        
    }
}

