import java.util.Scanner;

  
public class Main {
	
	
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  int n=Integer.MAX_VALUE;
	  
	  for(int i=0;i<n;i++){
		  int x=Integer.parseInt(sc.next());
		  int y=Integer.parseInt(sc.next());
		  if(x==0&&y==0){
			  break;
		  }
		  else if(x>y){
		  System.out.println(y +" "+ x);
		  }
		  else if(x<y){
			  System.out.println(x +" "+ y);
		  }
		  else if(x==y){
			  System.out.println(x +" "+ y);
		  }
	  }
    
  }
}