import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
	int max = Math.max(Math.max(A,B),C);
	int min = Math.min(Math.min(A,B),C);
    int m = A+B+C-max-min;

    System.out.println((m-min)+(max-m));
    }
}