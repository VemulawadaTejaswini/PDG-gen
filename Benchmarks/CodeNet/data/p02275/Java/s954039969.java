import java.io.*;
public class Main {
	public static void main(String[] args) {
		int i,n=0,maxi=-1;
		final int MAX=10000;
		// TODO Auto-generated method stub
     BufferedReader sca= new BufferedReader(new InputStreamReader(System.in));
     try{
     n=Integer.parseInt(sca.readLine());
     }catch(Exception e){
    	 System.out.println(e);
     }
    int[] data = new int[n+1];
    String[] hz=new String[n];
    int[] su = new int[MAX],data2=new int[n+1];
    try{
    	hz=(sca.readLine()).split("[\\s]+");
     for(i=1;i<=n;i++){
    	 data[i]=Integer.parseInt(hz[i-1]);
    	 if(maxi<data[i])maxi=data[i];
    	 su[data[i]]++;
     }
    }catch(Exception  e){
    	System.out.println(e);
    }
     for(i=1;i<=maxi;i++){
    	 su[i]+=su[i-1];
     }
     for(i=n;i>0;i--){
    	 data2[su[data[i]]]=data[i];
    	 su[data[i]]--;
     }
     for(i=1;i<n;i++){
    	 System.out.print(data2[i]+" ");
    	 
     }
     System.out.println(data2[i]);
	
	}

}
