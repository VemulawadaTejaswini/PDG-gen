import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] l=new int[2][1000];
        int fs=0;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.equals("")) {
                fs++;
            } else {
                int n=Integer.parseInt(str.split(",")[0])-1;
                l[fs][n]++;
            }
        }
        for(int i=0;i<l[0].length;i++) {
            if(l[0][i]>0&&l[1][i]>0) {
                System.out.println((i+1)+" "+(l[0][i]+l[1][i]));
            }
        }
    }
}
