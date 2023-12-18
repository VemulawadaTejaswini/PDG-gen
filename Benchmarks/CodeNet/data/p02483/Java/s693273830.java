import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	int b =sc.nextInt();
	int c =sc.nextInt();

	int f,s,t;
	if( a > b ){
	 if( a > c ){t = a;
	  if( b > c ){s = b; f = c;
	  }else{s = c; f = b;}
	 }else{s = a;
	  if( b > c ){t = b;f = c;
	  }else{t = c;f = b;}
	 }
	}else{
	 if( b > c ){t = b;
	  if( a > c ){s = a;f = c;
	  }else{s = c;f = a;}
	 }else{ s = b;t = c;f = a;
	 }
	}
	System.out.printf("%d %d %d\n",f,s,t);
}
	}