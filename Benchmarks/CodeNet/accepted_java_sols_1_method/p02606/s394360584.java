import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int l= sc.nextInt();
      	int r = sc.nextInt();
      	int d = sc.nextInt();
      	int p;
      	if(l%d==0){p=l/d-1;}
      	else{p=l/d;}
      	System.out.println(""+((r/d)-p));
}
}