import java.util.Scanner;

 class Main{
	
public static int bubbleSort(int A[],int N){
    int i,j,r=0,temp;
    boolean flag=true;
    for(i=0;flag;i++){
    	flag=false;
        for(j=N-1;j>=i+1;j--){
        	if(A[j]<A[j-1]){
        		temp=A[j];
        		A[j]=A[j-1];
        		A[j-1]=temp;
        flag=true;
        r++;      	
        }
}
}
    return r;
}
   
public static void main(String[] args){
         
		 Scanner sc= new Scanner(System.in);
	         int N=sc.nextInt();
             int A[]=new int[100];
             
             int i,j;
             for(i=0;i<N;i++){
            	 A[i] = sc.nextInt();
             }
	       
        int loop = bubbleSort(A,N);
        for(i=0;i<N;i++){
      	  if(i>0)
      	   System.out.print(" ");
         System.out.print(A[i]);
        }
        System.out.println();
        System.out.println(loop);
        sc.close();
}
}