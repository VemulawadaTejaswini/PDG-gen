import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
  		int countr=0;
  		int count=0;
		
  		String s=sc.next();
  		String[] a=s.split("");
  		
		for(int c=0;c<n;c++){
          if(a[c].equals("R")){
          countr++;
          }
    	}
    
 	for(int d=0;d<countr;d++){
    	if(a[d].equals("R")){
        	count++;
        }
    }
		ans=countr-count;
    	System.out.println(ans);
    }
}
