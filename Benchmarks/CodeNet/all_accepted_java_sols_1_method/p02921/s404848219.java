import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    String s=sc.next();
  	String t=sc.next();
  	String[] S=s.split("");
  	String[] T=t.split("");
   	int c=0;
    for(int a=0;a<3;a++){
   	if(S[a].equals(T[a])){
    c++;
    }
    }
    
    System.out.println(c);
    }
}

