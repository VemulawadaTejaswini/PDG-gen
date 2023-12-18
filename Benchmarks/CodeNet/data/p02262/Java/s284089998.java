import java.util.Scanner;

public class Main{
	public static int count=0;
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i,n,m=0;
        n=scan.nextInt();
        int arr[]=new int[n];
        int g[]=new int[n+1];
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
        	arr=insert(arr,n,g[i]);
        }
        System.out.println(count);
        show(arr,n);
        scan.close();
    }
	static int[] insert(int A[],int N,int g) {
		int i,j,v;
		for(i=1;i<N;i++){
            v=A[i];
            j=i-g;
            while(j>=0 && A[j]>v ){
                A[j+g]=A[j];
                j-=g;
                count++;
                A[j+g]=v;
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
