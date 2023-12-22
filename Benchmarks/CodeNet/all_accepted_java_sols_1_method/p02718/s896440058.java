import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] hyo = new int[n];
        int sumVote = 0;
        int count = 0;

        for(int i = 0;i < n;i++){
            hyo[i] = sc.nextInt();
            sumVote += hyo[i];
        }
        double base = sumVote/(4.0*m);
        for(int i = 0;i < n;i++){
            if(hyo[i] >= base){
                count++;
            }
        }
        System.out.println(m <= count?"Yes":"No");
    }
}