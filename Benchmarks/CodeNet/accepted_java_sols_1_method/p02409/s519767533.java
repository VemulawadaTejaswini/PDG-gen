import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] lst = new int[10][12];
        int b,f,r,v;
        for(int i=0;i<n;i++){
            b=sc.nextInt();f=sc.nextInt();
            r=sc.nextInt();v=sc.nextInt();
            lst[r-1][(b-1)*3+f-1]+=v;
        }
        for(int i=0;i<12;i++){
            if (i%3==0 && i>0){
                for(int x=0;x<20;x++){System.out.print("#");}
                System.out.println();
            }
            for(int j=0;j<10;j++){
                System.out.printf(" %d",lst[j][i]);
            }
            System.out.println();
        }
    }
}
