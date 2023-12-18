import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a= {{1,5},{6,2},{4,3},{5,1},{3,5},{1,6},{6,6}};
        for(;;) {
            char[] l=sc.next().toCharArray();
            if(l[0]=='#') {
                break;
            }
            int t=0;
            for(char c:l) {
                t=a[t][c-'0'];
            }
            System.out.println(t==3?"Yes":"No");
        }
    }
}
