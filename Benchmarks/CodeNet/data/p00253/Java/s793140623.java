import  java.util.*;
class Main{
    int n;
    int[] h=new int[101];
    
    Main(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    n=sc.nextInt();
	    if(n==0){
		break;
	    }
	    for(int i=0; i<n+1; i++){
		h[i]=sc.nextInt();
	    }
	    for(int i=0; i<n+1; i++){
		int[] a=new int[101];
		int b=0;
		for(int j=0; j<n+1; j++){
		    if(i!=j){
			a[b]=h[j];
			b++;
		    }
		}
		boolean flg=true;
		int key=a[1]-a[0];
		for(int j=1; j<n; j++){
		    if(key!=a[j]-a[j-1])flg=false;
		}
		if(flg){
		    System.out.println(h[i]);
		    break;
		}
	    }
	}
			       
       
    }

    public static void main(String[] args){
	new Main();
    }
}