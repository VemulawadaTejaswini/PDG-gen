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
	   int key,n,i,j,k;
	   
	   Scanner sc =new Scanner(System.in);
	   n=sc.nextInt();
	   
	   for(i=0;i<n;i++){
		 char com[] = sc.next().toCharArray();  
		 
		 
	  
	 if(com[0] =='i'){
		 key=sc.nextInt();
			  insert(key);
	    }else if(com[0]=='d'){
		   if(com.length>6){
			   if(com[6]=='F'){
				   deleteFirst();
			   }else{
				   deleteLast();
			   }
		   }else{
			   key=sc.nextInt();
			   for(k=0;k<com.length;k++){
				   if(list.get(k)==key){
					   delete(k);
					   break;
				   }
			   }
			   
		   }
	  } 
	   }
	   System.out.println(list); 
	   sc.close();
}
}