import  java.util.*;
 class MP{     
	int n; 
	            
 	void MP(){    
    Scanner sc = new Scanner(System.in);   
	n=sc.nextInt();
	
    int max=-1000000000;  
	int mini;    
	
 	mini=sc.nextInt();
	       
		for(int i=0; i<n-1; i++){         
			int num=sc.nextInt();
		              
			max=max(max,num-mini);        
			mini=min(mini,num);     
		}        
		System.out.println(max);   
		}       
	
		int max(int a,int b){    
		if(a>b)return a;     
		else return b;     
		}       
	
		int min(int a,int b){   
		if(a<b)return a;   
		else return b;     
		}    
	           
	public static void main(String[] args){     
		new MP();     
		} 
	}