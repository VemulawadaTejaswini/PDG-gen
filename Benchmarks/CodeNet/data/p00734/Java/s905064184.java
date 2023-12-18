import java.util.*;
class Main{
    int[] A;
    boolean[] B;
    void run(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    if((n|m)==0)break;
	    A=new int[n];
	    B=new boolean[101];
	    int sum=0,sumA=0;
	    int temp;
	    for(int i=0;i<n;i++){
		temp=sc.nextInt();
		sum+=temp;sumA+=temp;
		A[i]=temp;
	    }
	    for(int i=0;i<m;i++){
		temp=sc.nextInt();
		sum+=temp;
		B[temp]=true;
	    }
	    if(sum%2==1){
		System.out.println(-1);
		continue;
	    }
	    Arrays.sort(A);
	    int sum2=sum/2;
	    int temp2;
	    int i;
	    for(i=0;i<A.length;i++){
		temp2=sum2-(sumA-A[i]);
		if(temp2>0){
		    if(B[temp2]){
			System.out.println(A[i]+" "+temp2);
			break;
		    }
		}
	    }
	    if(i==A.length)System.out.println(-1);
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}
//dirty..