import java.util.Scanner;

class Main {
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	int a,b,t,sum;
	a = sc.nextInt();
	b = sc.nextInt();
	t = sc.nextInt();

	sum = (t/a) * b;
	System.out.println(sum);
    }
}

	
	
