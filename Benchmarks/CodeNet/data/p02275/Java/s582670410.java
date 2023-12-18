import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) {
		int i,n;
		final int MAX=10000;
		// TODO Auto-generated method stub
     Scanner scan= new Scanner(System.in);
     n=scan.nextInt();
    int[] data = new int[n+1];
    int[] su = new int[MAX],data2=new int[n+1];
    Arrays.fill(su,0);
     for(i=1;i<=n;i++){
    	 data[i]=scan.nextInt();
    	 su[data[i]]++;
     }
     for(i=1;i<MAX;i++){
    	 su[i]+=su[i-1];
     }
     for(i=n;i>0;i--){
    	 data2[su[data[i]]]=data[i];
    	 su[data[i]]--;
     }
     for(i=1;i<=n;i++){
    	 if(i==n){
    	 System.out.println(data2[i]);
     }else{
    	 System.out.print(data2[i]+" ");
     }
     }
     
	}

}
