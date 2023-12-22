import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n,x,count=0;
	    int data[] = new int[100];
	    while(true){
	        n = sc.nextInt();
	        x = sc.nextInt();
	        if(n==0&&x==0)break;
	        for(int i=0;i<n;i++)data[i]=i+1;

	        for(int i=0;i<n-2;i++){
	            for(int j = i+1;j<n-1;j++){
	                for(int k=j+1;k<n;k++){
	                    if(x==data[i]+data[j]+data[k])count++;
	                }
	            }
	        }
	        System.out.println(count);
	        count=0;
	    }
	        sc.close();
	}
}

