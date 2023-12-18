import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong() - 1;
        long b = 26;
        int d = 1;
        String res = "";

        while(true) {
            if(n < b) {
                  char[] c = new char[d];
                  for(int i=0; i<d; i++) {
                      c[d-1-i] = (char)('a' + (n % 26));
                      n/=26;
                  }
                  System.out.println(new String(c));
                  return;
            }
            d++;
            n-=b;
            b*=26;
        }


    }


}