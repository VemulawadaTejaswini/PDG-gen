import java.util.*;

class Main{

    void run(){
	Scanner sc=new Scanner(System.in);
	int[] a=new int[55];
	int pn=0;
	while(sc.hasNext()){
	    int[] b=new int[55];
	    String s=sc.nextLine();
	    int n=s.length()/2+1;
	  
	    int i=1;
	    
	    for(int pt=0;pt<s.length();pt++){
		int k=0;
		char c=s.charAt(pt);
		k=c-'0';
		while(++pt<s.length() && s.charAt(pt)!=','){
		    k=k*10+s.charAt(pt)-'0';
		}
		b[i++]=k;
	    }	 
	    int[] t=new int[a.length];
	    for(i=1;i<a.length-1;i++){
		t[i]=Math.max((pn<n)?a[i-1]:a[i+1],a[i])+b[i];
	    }
	    for( i=0;i<a.length;i++)a[i]=t[i];
	  
	    pn=n;
	}

	int ans=0;
	for(int i=0;i<a.length;i++)ans=Math.max(ans,a[i]);

	System.out.println(ans);
    }

    public static void main(String[] args){
	new Main().run();
    }
}		    
	