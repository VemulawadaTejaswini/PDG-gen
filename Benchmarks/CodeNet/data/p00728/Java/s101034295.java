import java.util.Scanner;
public class score {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	int[] score=new int[20];
	int a=0;
	
	while(true){
    int n=sc.nextInt();
    if(n==0) break;
    int[] s=new int[n];
    int sum=0;
    
    for(int i=0;i<n;i++){
    	s[i]=sc.nextInt();
    }
    
    for(int i=0;i<n;i++){
    	for(int j=i+1;j<n;j++){
    	int temp=0;
    		if(s[i]>=s[j]){	//?°??????????
    			temp=s[i];
    			s[i]=s[j];
    			s[j]=temp;
    		}
    	}	
    }
    
    for(int i=1;i<n-1;i++){
    	sum +=s[i];
    }
    int ave=sum/(n-2);
    score[a]=ave;
    a++;
    
	}
	
	for(int i=0;i<a;i++){
	 System.out.printf("%d\n",score[i]);
	}
}
}