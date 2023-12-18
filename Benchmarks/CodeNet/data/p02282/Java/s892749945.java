import java.util.*;
public class Main {
	static int[][] list;
	static int[] check;
    
	public static void main(String[] args){
    	 Scanner sc= new Scanner(System.in);
    	 int n =sc.nextInt();
    	 list =new int[n][2];
    	 check = new int[n];
    	 for(int i=0;i<n;i++){
    		 list[i][0]=sc.nextInt();
    	 }
    	 for(int i=0;i<n;i++){
    		 check[i]=sc.nextInt();
    		 for(int j=0;j<n;j++){
    			 if(check[i]==list[j][0]){
    				 list[j][1]=i;
    			 }
    		 }
    	 }
    	 mpost(0,n,list);
    	 
     }
     
     static int reg=0;
     
     static void mpost(int a,int b,int[][] list){
    	if(a>=b){
    		return;
    	}else{
    	 int num=list[reg][0];
    	 int id=list[reg][1];
    	 reg++;
    	 mpost(a,id,list);
    	 mpost(id+1,b,list);
    	 System.out.print(num);
    	 System.out.print(num==list[0][0]?"\n":" ");
    	}
     }
}
