import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
  		int t=0;
  if(x==2){
 	 System.out.println(x);
  }else{
  
   for(int x1=x;x1>0;x1++){
     for(int c=2;c<x1;c++){
         if(x1%c==0){
           t=0;
           break;
          }else{
           t++;
         }
    	 }
     if(t>0){
        System.out.println(x1);
           return;
     } 
   }

  }
    }
}