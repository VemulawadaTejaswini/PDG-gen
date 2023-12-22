import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r,c,i,j,csum;
        r=scan.nextInt();
        c=scan.nextInt();
        int array[][]=new int[r][c],rsum[]=new int[c+1];
        for(i=0;i<c;i++) {
        	rsum[i]=0;
        }
        for(i=0;i<r;i++) {
        	for(j=0;j<c;j++) {
        		array[i][j]=scan.nextInt();
        	}
        }
        for(i=0;i<=r;i++) {
        	csum=0;
        	if(i<r) {
        		for(j=0;j<=c;j++) {
        			if(j<c) {
        				System.out.print(array[i][j] + " ");
        				csum+=array[i][j];
        				rsum[j]+=array[i][j];
        			}
        			else {
        				System.out.println(csum);
        				rsum[j]+=csum;
        			}
        		}
        	}
        	else {
        		for(j=0;j<=c;j++) {
        			if(j<c) {
        				System.out.print(rsum[j] + " ");
        			}
        			else {
        				System.out.println(rsum[j]);
        			}
        		}
        	}
        }
    }
}

