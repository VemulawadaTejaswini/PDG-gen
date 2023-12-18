import  java.util.*;
class Main{
    int n;
    int[] R=new int[200000];
    Main(){
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	int ans=-1000000000;
	for(int i=0; i<n; i++){
	    R[i]=sc.nextInt();
	    for(int j=0; j<i; j++){
	        int num=R[i]-R[j];
		if(ans<num)ans=num;
	    }
	}
	System.out.println(ans);
    }

    public static void main(String[] args){
	new Main();
    }
}