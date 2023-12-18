import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
      	int num = sc.nextInt();
      	long a=1L;

      	for(int i=0; i<num;i++) {
      		a *= sc.nextLong();
      	}

      	if(a>1000000000000000000L) {
      		a = -1;
      	}
      	
      	sc.close();

		System.out.println(a);
	}
}