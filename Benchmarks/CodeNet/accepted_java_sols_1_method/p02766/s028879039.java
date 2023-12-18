import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        int count = 1;
        while(n >= k){
          n = n / k;
          count++;
        }
        System.out.println(count);
    }
}