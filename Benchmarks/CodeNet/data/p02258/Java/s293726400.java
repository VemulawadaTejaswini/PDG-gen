import  java.util.*;
 class Main{     
	int n; 
	            
 	void Main(){    
    Scanner sc = new Scanner(System.in);   
	n=sc.nextInt();
	int m=-2000000000;  
	int mini;    
	mini=sc.nextInt();

		for(int i=0; i<n-1; i++){         
			int num=sc.nextInt();
		              
			m=max(m,num-mini);        
			mini=min(mini,num);     
		}        
		System.out.println(m); 
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
		new Main();     
		} 
	}