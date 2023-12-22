import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
		
		String s=sc.next();
     

  		String[] s1=s.split("");
		
    
 	if(s1[k-1].equals("A")){
    		s1[k-1]="a";
    	}else if(s1[k-1].equals("B")){
     		s1[k-1]="b";
   	 }else{
    	s1[k-1]="c";
    }
  		String ans="";
		for(String a:s1){
    		ans+=a;
        }
  		System.out.println(ans);
    }
}