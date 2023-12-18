import java.util.*;
 
class Main {
    
	static int res=0,d,w,E[][]=new int[10][10];
	
    public static void main(String[] args) {
         
       Scanner cin=new Scanner(System.in);
       
       while(true) {
    	   int N=cin.nextInt(),M=cin.nextInt();
    	   
    	   if(N==0)break;
    	   
    	   int r=cin.nextInt();
    	   
    	   int data[][]=new int[r][4];
    	   
    	   for(int i=0;i<r;i++) {
    		   data[i][0]=cin.nextInt();data[i][1]=cin.nextInt();data[i][2]=cin.nextInt();data[i][3]=cin.nextInt();  
    	   }
    	   
    	   int q=cin.nextInt();
    	   for(int i=0;i<q;i++) {
    		   int ts=cin.nextInt(),te=cin.nextInt(),tm=cin.nextInt();
    		   int pc=0,res=0;
    		   
    		   //System.out.println("SEARCHING TARGET "+tm);
    		   
    		   List<Integer> tl=new ArrayList<>();
    		   
    		   for(int j=0;j<data.length;j++) {
    			
    			   int t=data[j][0], n=data[j][1], m=data[j][2], s=data[j][3];
    			   
    			   //System.out.printf("%d %d %d %d\n",t,n,m,s);
    			   
    			   if(m==tm && s==1) {
    				   if(pc==0)tl.add(t);
    				   pc++;
    				   //System.out.println("TARGET MEMBER LOGIN AT "+t);
    			   }
    			   else if(m==tm && s==0) {
    				   pc--;
    				   //System.out.println("TARGET MEMBER LOGOUT AT "+t);
    				   if(pc==0) {
    					   tl.add(t);
    				   }
    			   }
    		   }
    		   
    		   for(int j=0;j<tl.size()-1;j+=2) {
    			   
    			   int s=tl.get(j),e=tl.get(j+1);
    			   
    			   if(s<ts)s=ts;
    			   else if(s>te)s=0;
    			   if(e>te)e=te;
    			   else if(e<ts)e=0;
    			   
    			   res+=e-s;
    		   }
    		   
    		   System.out.println(res);
    	   }
       }
    }
}

