import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int xy[] = new int[2];
        StringBuilder sb;
        for(int j=1; j<=10000; j++){
            xy[0] = sc.nextInt();
            xy[1] = sc.nextInt();
            if(xy[0]==0 && xy[1]==0) break;
            Arrays.sort(xy);
            sb = new StringBuilder();
            sb.append(xy[0]).append(" ").append(xy[1]);
            System.out.println(sb.toString());
        }
        sc.close();
    }
}