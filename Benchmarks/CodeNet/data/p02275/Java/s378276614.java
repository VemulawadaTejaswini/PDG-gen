import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n,i,j,k=10001,m,count=0;
        n=scan.nextInt();
        int[] c=new int[k];
        for(i=0;i<n;i++){
        	m=scan.nextInt();
        	c[m]++;
        }
        for(i=0;i<k;i++){
        	if(c[i]>0){
        		for(j=0;j<c[i];j++){
        			if(count<n-1){
        				System.out.print(i+" ");
        				count++;
        			}
        			else{
        				System.out.println(i);
        			}
        		}
        	}
        }
        scan.close();
	}

}

