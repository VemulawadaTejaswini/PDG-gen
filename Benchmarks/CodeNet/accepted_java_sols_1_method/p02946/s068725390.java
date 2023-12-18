import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
     	int x=sc.nextInt();
  
		for(int c=x-k+1;c<=x+k-1;c++){
    	System.out.println(c);
        }
    }
}
