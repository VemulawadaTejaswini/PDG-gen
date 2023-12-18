import java.util.Scanner;

class fibonacci{
    private int num;
    private int n1 = 1;
    private int n2 = 1;
    private int temp = 1;
    
    public fibonacci(int num){
	this.num = num;
    }
    
    public int cal(int num){
	for (int i=1; i<num; i++){
	    temp = n1 + n2;
	    n1 = n2;
	    n2 = temp;
	}
	return temp;
    }
}

public class Fibo{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	fibonacci f = new fibonacci(n);
	System.out.println(f.cal(n));
    }
}

