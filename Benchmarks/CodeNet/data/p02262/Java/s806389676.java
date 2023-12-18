import java.util.Scanner;

public class Main{
	public static int count=0;
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i,n,m=0;
        n=scan.nextInt();
        int arr[]=new int[n];
        int g[]=new int[n];
        for(i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }
        while(true) {
        	m++;
            g[m]=(int)(Math.pow(3,m)-1)/2;
        	if((Math.pow(3,m+1)-1)/2>n)break;
        }
        System.out.println(m);
        for(i=m;i>0;i--) {
        	if(i>1) {
        		System.out.print(g[i]+" ");
        	}
        	else {
        		System.out.println(g[i]);
        	}
        	arr=insart(arr,n,g[i]);
        }
        System.out.println(count);
        show(arr,n);
        scan.close();
    }
	static int[] insart(int A[],int n,int g) {
		int i,j,min,swap;
		for(i=0;i<n;i++) {
            min=i;
            for(j=i;j<n;j+=g) {
                if(A[min]>A[j]) {
                    min=j;
                }
            }
            count++;
            if(min!=i) {
                swap=A[min];
                A[min]=A[i];
                A[i]=swap;
            }
        }
		return A;
	}
	static void show(int A[],int n) {
		int i;
		for(i=0;i<n;i++) {
        	System.out.println(A[i]);
        }
	}
}
