import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int a,b,s=0;
		String op="+";
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			a=scan.nextInt();

			op=scan.next();
			b=scan.nextInt();
			if(op.equals("?"))
				break;
			
			switch (op){
			  case "+":
				  s=a+b;
				  break;
			  case "-":
				  s=a-b;
				  break;
			  case "*":
				  s=a*b;
				  break;
			  case "/":
				  s=a/b;
				  break;
				    default :
				    break;
			}
		System.out.println(s);
		
		}
		
	}
	}