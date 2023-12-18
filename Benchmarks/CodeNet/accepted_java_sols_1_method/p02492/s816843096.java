import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		ArrayList<Integer> reslt = new ArrayList<Integer>();
    Scanner var = new Scanner(System.in);
    int a,b;
    String op;
  do {
    a = var.nextInt();
    op=var.next();
    b=  var.nextInt();
  if(op.equals("+")){
    reslt.add(a+b);
	}else if (op.equals("-")){
    reslt.add(a-b);
	}else if(op.equals("*")){
    reslt.add(a*b);
	}else if(op.equals("/")){
    reslt.add(a/b);
	}else if(op.equals("?")){
      break;
    }
  }while(!(op.equals("?")));
	  for(int i=0;i<reslt.size(); i++){
		  System.out.println(reslt.get(i));
	  }
	}
}