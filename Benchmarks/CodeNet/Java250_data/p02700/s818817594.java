import java.util.*;
class Main{
 static public void main(String args[]){
  Scanner sc=new Scanner(System.in); 
   boolean flag;
   int a,b,c,d;
   a=sc.nextInt();
   b=sc.nextInt();//kougeki
   c=sc.nextInt();
   d=sc.nextInt();//kougeki
   
   while(true){
  	
     c-=b;
	 
	 	if(c<=0){
	 	flag=true;break;
		}

	 a-=d;
	    if(a<=0){
	 	flag=false;break;
		}
		
	 else continue;
   }
   
   if(flag)System.out.println("Yes");
   else System.out.println("No");
 }
}