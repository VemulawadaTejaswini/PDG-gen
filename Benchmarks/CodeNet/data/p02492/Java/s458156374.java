import java.util.Scanner;



public class Main{

public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();

	String op = sc.next();

	int b = sc.nextInt();

	while(true){

		if(op=="+"){

			int answer = a+b;

			System.out.println(answer);

		}else if(op=="-"){

			int answer = a-b;

			System.out.println(answer);

		}else if(op=="/"){

			int answer = a/b;

			System.out.println(answer);

		}else if(op=="*"){

			int answer = a*b;

			System.out.println(answer);

		}else{

			break;

		}

	} 

}

}