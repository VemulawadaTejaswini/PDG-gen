import  java.util.*;
class Main{     
	Scanner sc = new Scanner(System.in);   
	int n; 
	int m=-2000000000;  
	int mini;
	   
	void mp(){  
		n=sc.nextInt();
		mini=sc.nextInt();
		
		for(int i=0; i<n-1; i++){         
			int d=sc.nextInt();
		   	m=maxv(m,d-mini);        
			mini=minv(mini,d);     
		}        
		System.out.println(m); 
		}       
	
		int maxv(int a,int b){    
		if(a>b)return a;     
		else return b;     
		}       
	
		int minv(int a,int b){   
		if(a<b)return a;   
		else return b;     
		}    
	           
	public static void main(String[] args){     
		new Main().mp();     
		} 
	}