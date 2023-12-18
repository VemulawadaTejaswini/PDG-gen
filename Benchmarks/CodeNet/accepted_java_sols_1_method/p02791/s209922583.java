import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  		int[] p=new int[n];
    for(int c=0;c<n;c++){
    p[c]=sc.nextInt();
    }
  
    int ans=0;
    int c=p[0];
  
  for(int d=0; d<n-1; d++){
     if(c<p[d+1]){
       ans++; 
     }
    c=Math.min(c,p[d+1]);
    }
     
  
    System.out.println(n-ans);
    
    
   
    }
}