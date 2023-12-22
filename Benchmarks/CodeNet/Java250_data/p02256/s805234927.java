import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	System.out.println(euc(n1,n2));
    }
    private static int euc(int n1, int n2){
	if(n1 < n2) return euc(n2,n1);
	if(n2 == 0) return n1;
	return euc(n2,n1%n2);
    }
}

