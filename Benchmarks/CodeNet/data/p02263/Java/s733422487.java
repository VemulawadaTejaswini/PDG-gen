import java.util.ArrayDeque;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	ArrayDeque a = new ArrayDeque<Integer>();
  	Scanner sc = new Scanner(System.in);
  	
  	while(sc.hasNext()){
  		//System.out.println(sc.next());
  		if(sc.hasNextInt()){
			System.out.println("if");
		  	a.push(sc.nextInt());
  		}else{
			System.out.println("else");
  			int o1 = (int)a.pop();
  			int o2 = (int)a.pop();
  			switch(sc.next().charAt(0)){
	  			case '+':
		  			a.push(o1 + o2);
		  			break;
		  		case '-':
		  			a.push(o2 - o1);
		  			break;
		  		case '*':
		  			a.push(o1 * o2);
		  			break;
		  		default:
		  			break;
  			}
  		}
  		//System.out.println(a.peek());
  		
  	}
  	System.out.println(a.pop());

  }
  
}