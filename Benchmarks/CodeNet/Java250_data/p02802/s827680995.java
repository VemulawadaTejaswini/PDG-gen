import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc .nextInt();
        int M = sc.nextInt();
        int wa[] = new int[N+1];
        int correct=0,penalties=0;
        while (M-- > 0){
            int p = sc.nextInt();
            String s = sc.next();
            if(wa[p]==-1){
                continue;
            }
            if(s.equals("WA")){
                wa[p]++;
            }
            else {
                correct++;
                penalties += wa[p];
                wa[p] = -1;
            }
        }

        System.out.println(correct+" "+penalties);
    }
}
