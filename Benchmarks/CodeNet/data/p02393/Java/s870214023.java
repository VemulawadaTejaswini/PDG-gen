import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
	  Scanner sc = new Scanner(System.in);
	  
	  int a = sc.nextInt();
	  
	  int b = sc.nextInt();
	  
	  int c = sc.nextInt();
	  
	  int min = 0;
	  int chuu = 0;
	  int max = 0;
	  
	  if(a>=b){
		  if(a>=c){max=a;if(b>=c){chuu=b;min=c;}
		  else{chuu=c;min=b;}
		  }else{max=c;chuu=a;min=b;}
		  }else{if(b>=c){max=b;if(a>=c){chuu=a;min=c;}
		  else{chuu=c;min=a;}
		  }else{max=c;chuu=b;min=a;}
		  }
	
	  System.out.println(max+" "+chuu+" "+min);
	  
  }
}