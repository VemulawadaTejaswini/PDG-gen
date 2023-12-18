import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n,i,j;
        long count=0;
        n=scan.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++){
        	a[i]=scan.nextInt();
        }
        for(i=0;i<n-1;i++){
        	for(j=i+1;j<n;j++){
        		if(a[i]<a[j]){
        			continue;
        		}
        		else{
        			count++;
        		}
        	}
        }
        System.out.println(count);
        scan.close();
	}

}


