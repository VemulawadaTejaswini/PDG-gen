import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int H=sc.nextInt();
       int W=sc.nextInt();
       int field[][]=new int [H][W];
       int h=sc.nextInt();
       int w=sc.nextInt();

       for(int i=0;i<h;i++) {
    	   for(int j=0;j<W;j++) {
    		   field[i][j]=1;
    	   }
       }
       for(int i=0;i<H;i++) {
    	   for(int j=0;j<w;j++) {
    		   field[i][j]=1;
    	   }
       }
       int ans=0;
       for(int i=0;i<H;i++) {
    	   for(int j=0;j<W;j++) {
    		   if(field[i][j]==0)ans++;
    	   }
       }
    	   System.out.println(ans);
    }
    }