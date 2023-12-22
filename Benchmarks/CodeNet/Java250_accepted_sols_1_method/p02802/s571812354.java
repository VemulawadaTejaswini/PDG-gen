import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] data = new int[n][2];
        for (int i=0;i<m;i++){
            int p = sc.nextInt()-1;
            String s = sc.next();
            if (data[p][0]==0&&s.equals("WA")){
                data[p][1]++;
            }else if (data[p][0]==0&&s.equals("AC")){
                data[p][0]++;
            }
        }
        int ac=0;
        int wa=0;
        for (int i=0;i<n;i++){
            ac+=data[i][0];
            if (data[i][0]==1)wa+=data[i][1];
        }
        System.out.println(ac+" "+wa);

    }
}
