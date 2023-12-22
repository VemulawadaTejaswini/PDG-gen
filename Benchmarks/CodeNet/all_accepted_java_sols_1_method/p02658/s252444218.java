import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            long []arr =new long[n];
            long a =1;
            long val1=(long)Math.pow(10, 18);
             long max =1;
             boolean flag=false;
             for(int i=0;i<arr.length;i++){
            	 arr[i]=scn.nextLong();
            	 if(arr[i]==0){
            		 flag=true;
            	 }
             }
             if(flag){
            	 System.out.println(0);
            	 return;
             }
            
            for(int i=0;i<arr.length;i++){
            	long val =arr[i];
            	//System.out.println(val+"a");
            
            	a*=val;
//            	System.out.println(max+"^"+a);
            	if(a<max||a>val1){
            		System.out.println(-1);
            		return;
            	}else{
            		max=a;
            	}
            }
            System.out.println(a);
	}

}