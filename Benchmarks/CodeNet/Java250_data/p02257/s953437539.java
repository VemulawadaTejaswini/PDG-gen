import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static final int BIG_NUM  = 2000000000;
    public static final int MOD  = 1000000007;
 
    public static void main(String[] args) {
 
        int table[] = new int[10001];
 
        for(int i = 0; i <= 10000; i++){
            table[i] = 1;
        }
 
        int limit = (int)Math.sqrt(10000);
        for(int i = 2; i <= limit; i++){
            if(table[i] == 1){
                for(int k = 2*i; k <= 10000; k += i){
                    table[k] = 0;
                }
            }
        }
 
        ArrayList<Integer> prime = new ArrayList<Integer>();
        for(int i = 2; i <= 10000; i++){
            if(table[i] == 1){
                prime.add(Integer.valueOf(i));
            }
        }
 
        Scanner scanner = new Scanner(System.in);
 
        int N = scanner.nextInt();
        int input,tmp,count = 0;
        boolean FLG;
 
        for(int loop = 0; loop < N; loop++){
            input = scanner.nextInt();
 
            FLG = false;
            for(int i = 0; i < prime.size(); i++){
                tmp = prime.get(i);
                if(input%tmp == 0 && (input/tmp) > 1){
                    FLG = true;
                    break;
                }
                if(tmp*tmp > input){
                    break;
                }
            }
            if(!FLG)count++;
        }
        System.out.println(count);
    }
}
