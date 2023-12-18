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
		  if(a>=c){min=a;if(b>=c){chuu=b;max=c;}
		  else{chuu=c;max=b;}
		  }else{min=c;chuu=a;max=b;}
		  }else{if(b>=c){min=b;if(a>=c){chuu=a;max=c;}
		  else{chuu=c;max=a;}
		  }else{min=c;chuu=b;max=a;}
		  }
	
	  System.out.println(max+" "+chuu+" "+min);
	  
  }
}