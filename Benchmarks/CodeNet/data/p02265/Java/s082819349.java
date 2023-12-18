import java.util.LinkedList;
import java.util.Scanner;
 class Main{
	static LinkedList<Integer> list = new LinkedList<Integer>();
	
	
	public static void insert(int key){
		list.add(key);
	}
	
	public static void delete(int key){
		list.remove(key);
	}
	
	public static void deleteFirst(){
		list.removeFirst();
	}
	
	public static void deleteLast(){
		list.removeLast();
	}
	
   public static void main(String[] args) {
	   int key,n,i,j;
	   String str;
	   String[] com =new String[20];
	   Scanner sc =new Scanner(System.in);
	    n=sc.nextInt();
	   
	   for(i=0;i<n;i++){
		  
		  for(j=0;(str=sc.next())!=" ";j++){
		       com[j] = str;
		  }
		  
		  key=sc.nextInt();
	    
	  if(com[0] =="i"){
			  insert(key);
	    }else if(com[0]=="d"){
		   if(com.length>6){
			   if(com[6]=="F"){
				   deleteFirst();
			   }else if(com[6]=="L"){
				   deleteLast();
			   }
		   }else{
			   delete(key);
		   }
	  } 
	   }
	   System.out.println(list); 
	   sc.close();
}
}