import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        for(int c10k=0; c10k<=Y/10000; c10k++){
            int c5kmax = (Y-10000*c10k)/5000;
            for(int c5k=0; c5k<=c5kmax; c5k++){
                if(Y-10000*c10k-5000*c5k==(N-c10k-c5k)*1000){
                    String ans = Integer.toString(c10k)+" "+Integer.toString(c5k)+" "+Integer.toString(N-c5k-c10k);
                    System.out.println(ans);
                    System.exit(0);
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}