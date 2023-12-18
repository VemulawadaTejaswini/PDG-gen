import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,m,l,i,j,k;
        n=scan.nextInt();
        m=scan.nextInt();
        l=scan.nextInt();
        long arraya[][]=new long[n][m],arrayb[][]=new long[m][l],arrayc[][]=new long[n][l];
        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                arraya[i][j]=scan.nextInt();
            }
        }
        for(i=0;i<m;i++) {
        	for(j=0;j<l;j++) {
                arrayb[i][j]=scan.nextInt();
            }
        }
        for(i=0;i<n;i++) {
        	for(j=0;j<l;j++) {
                arrayc[i][j]=0;
            }
        }
        for(i=0;i<n;i++) {
        	for(j=0;j<m;j++) {
        		for(k=0;k<l;k++) {
                	arrayc[i][k]+=arraya[i][j]*arrayb[j][k];
                }
            }
        }
        for(i=0;i<n;i++) {
        	for(j=0;j<l;j++) {
                if(j<l-1) {
                	System.out.print(arrayc[i][j] + " ");
                }
                else {
                	System.out.println(arrayc[i][j]);
                }
            }
        }
    }
}
