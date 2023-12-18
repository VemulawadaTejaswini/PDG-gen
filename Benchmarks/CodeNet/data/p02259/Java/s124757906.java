import java.util.Scanner;

public class Main{
 
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i,j,n,count=0,swap;
        n=scan.nextInt();
        int a[]=new int [n];
        for(i=0;i<n;i++){
        	a[i]=scan.nextInt();
        }
        for(i=n;i>0;i--){
        	for(j=0;j<i-1;j++){
        		if(a[j]>a[j+1]){
        			swap=a[j];
        			a[j]=a[j+1];
        			a[j+1]=swap;
        			count++;
        		}
        	}
        }
        for(i=0;i<n;i++){
        	if(i>0){
        		System.out.print(" ");
        	}
        	System.out.print(a[i]);
        }
        System.out.println("");
        System.out.println(count);
    }
}

