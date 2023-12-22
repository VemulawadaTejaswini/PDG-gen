import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	if(N%111 == 0) {
	    System.out.println(N);
	    return;
	}
	int num = N/111+1;
	System.out.println(num*100+num*10+num);
    }
}