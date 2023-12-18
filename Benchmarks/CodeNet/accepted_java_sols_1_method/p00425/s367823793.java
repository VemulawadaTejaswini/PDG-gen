import java.util.Scanner;


class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    while(true){
      int N = sc.nextInt();

      if(N == 0){
	break;
      }

      int top = 1;
      int north = 5;
      int south = 2;
      int east = 3;
      int west = 4;
      int bottom = 6;
      
      int S = 1;

      for(int i = 0; i < N; i++){
	String op = sc.next();
	
	if("North".equals(op)){
	  int old = top;
	  top = south;
	  south = bottom;
	  bottom = north;
	  north = old;
	}else if("South".equals(op)){
	  int old = top;
	  top = north;
	  north = bottom;
	  bottom = south;
	  south = old;
	}else if("East".equals(op)){
	  int old = top;
	  top = west;
	  west = bottom;
	  bottom = east;
	  east = old;
	}else if("West".equals(op)){
	  int old = top;
	  top = east;
	  east = bottom;
	  bottom = west;
	  west = old;
	}else if("Right".equals(op)){
	  int old = south;
	  south = east;
	  east = north;
	  north = west;
	  west = old;
	}else if("Left".equals(op)){
	  int old = south;
	  south = west;
	  west = north;
	  north = east;
	  east = old;
	}

	S += top;
      }

      System.out.println(S);
    } 
  }
}