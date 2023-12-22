import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,m,i,j;
        n=scan.nextInt();
        m=scan.nextInt();
        int arraya[][]=new int[n][m],arrayb[]=new int[m],arrayc[]=new int[n];
        for(i=0;i<n;i++) {
        	for(j=0;j<m;j++) {
        		arraya[i][j]=scan.nextInt();
        	}
        }
        for(i=0;i<m;i++) {
        	arrayb[i]=scan.nextInt();
        }
        for(i=0;i<n;i++) {
        	arrayc[i]=0;
        }
        for(i=0;i<n;i++) {
        	for(j=0;j<m;j++) {
        		arrayc[i]+=arraya[i][j]*arrayb[j];
        	}
        }
        for(i=0;i<n;i++) {
        	System.out.println(arrayc[i]);
        }
    }
}

