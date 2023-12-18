import java.util.LinkedList;
import java.util.Scanner;
 class Main {
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
	   int key,n,i,j,k,m;
	   
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
				   deleteLast();
			   }else{
				   deleteFirst();
			   }
		   }else{
			   key=sc.nextInt();
			   for(k=0;k<list.size();k++){
				   if(list.get(k)==key){
					   delete(k);
					   break;
				   }
			   }
			   
		   }
	  } 
	   }
	   
	   for(m=list.size();m>0;m--){  
		   
	   System.out.print(list.get(m-1));
        if(m>1)
            System.out.print(" ");
	   }
	  System.out.println();
	   sc.close();
}
}