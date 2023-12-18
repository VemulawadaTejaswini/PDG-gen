

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
      long [] num=new long [n];
   long sum=1;
        for (int i = 0; i <n; i++) {
            num[i]= in.nextLong();
            sum=sum*num[i];
        }
        if (sum>(10^18)) {
            System.out.println("-1");
            
        }
        else{
        
        System.out.println(sum);
        }
}
}