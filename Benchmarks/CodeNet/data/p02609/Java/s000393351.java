import java.util.*;
import java.lang.*;

public class MyTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, pop1, pop2;
        String s;

        n = Integer.valueOf(in.nextLine());
        s = in.nextLine();
        pop1 = popCount(s);
        pop2 = pop1-1;
        pop1++;
        for(int i=0;i<n;i++){
            String x = s.substring(0, i) + (s.charAt(i)=='1'?'0':'1') + s.substring(i+1);
            int count = 0;
            int xi = 0;
            int pop = 1;

            if(s.charAt(i)=='1'){
                pop = pop2;
            }else{
                pop = pop1;
            }

            if(pop>0){
                for(int j=0; j<n; j++){
                    if(x.charAt(j)=='1'){
                        xi += Math.pow(2, n-j-1) % pop;
                    }
                }
                xi = xi % pop;
                count++;
            }

            while(xi > 0){
                xi = xi % popCount(xi);
                count++;
            }
            print(count);
        }

        in.close();
    }

    private static int popCount(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            count += s.charAt(i)=='1' ? 1 : 0;
        }
        return count;
    }

    private static int popCount(long n){
        int count = 0;
        while(n>0){
            count += n%2;
            n /= 2;
        }
        return count;
    }

    private static void print(Object obj){
        System.out.println(obj);
    }
} // javac MyTest.java & java MyTest < input.txt > out