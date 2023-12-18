import java.util.*;

class Main{
        public static void main(String args[]){
                Scanner stdin = new Scanner(System.in);
                long X, Y;
                X = stdin.nextLong();
                Y = stdin.nextLong();

                int res = 0;
                while (X <= Y) {
                        res++;
                        X *= 2;
                }
                System.out.println(res);
        }
}
