import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] t=new int[n][6]; 
        for(int i=0;i<n;i++) {
            for(int j=0;j<6;j++) {
                t[i][j]=sc.nextInt()*60+sc.nextInt();
            }
        }
        int max=0;
        for(int i=0;i<n;i++) {
            int count=0;
            for(int j=0;j<n;j++) {
                //boolean f=true;
                int c=0;
                for(int k=0;k<6;k+=2) {
                    if(t[i][k]>=t[j][k]&&t[i][k]<=t[j][k+1]||t[i][k+1]>=t[j][k]&&t[i][k+1]<=t[j][k+1]) {
                        //f=false;
                        c++;
                    }
                }
                //if(f) {
                if(c>2) {
                    count++;
                }
            }
            max=Math.max(max, count);
        }
       System.out.println(max);
}}
