import java.util.Scanner;

public class Main {

	public static int count=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n,i,j,k=10001,m;
        n=scan.nextInt();
        int[] c=new int[k];
        for(i=0;i<n;i++){
        	m=scan.nextInt();
        	c[m]++;
        }
        for(i=0;i<k;i++){
        	if(c[i]>0){
        		show(c[i],i);
        		if(count<n){
        			System.out.print(" ");
        		}
        	}
        }
        scan.close();
	}
	public static void show(int n,int i){
		if(n>1){
			System.out.print(i+" ");
			show(n-1,i);
		}
		else{
			System.out.print(i);
		}
		count++;
	}

}

