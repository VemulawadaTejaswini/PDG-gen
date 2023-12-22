import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        long x = sc.nextLong();
        boolean ok = true;
        for(long i = -1000; i <= 1000 && ok; ++i) {
            for(long j = -1000; j <= 1000 && ok; ++j){
                if(i * i * i * i * i - j * j * j * j * j == x){
                    System.out.println(i + " " + j);
                    ok = false;
                }
            }
        }
    }    
}