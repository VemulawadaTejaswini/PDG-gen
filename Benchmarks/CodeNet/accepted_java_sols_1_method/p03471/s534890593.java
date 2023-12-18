import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int N = Integer.parseInt(str[0]);//1-2000 x + y + z = X
        int Y = Integer.parseInt(str[1])/1000;//1-20000 10 5 1　10x + 5y + z = Y
        boolean ok = false;
        for(int i = 0 ; i <= N ; i++) {
            int newX = N - i;
            int newY = Y - i;
            newY -= newX * 5;
            if(newY >= 0 && newY % 5 == 0) {
                if(newX - newY / 5 >= 0) {
                    ok = true;
                    System.out.println((newY / 5)+" "+(newX - newY / 5)+" "+i);
                    break;
                }
            }
        }
        if(!ok) {
            System.out.println("-1 -1 -1");
        }
    }
}
