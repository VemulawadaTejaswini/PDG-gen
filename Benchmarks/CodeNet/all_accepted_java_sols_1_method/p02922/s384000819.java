import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int A = sc.nextInt();

	int B = sc.nextInt();

	int figure = 1;

	int ans = 0;

	while(figure < B){

	figure += A-1;

	ans++;	

  }

	System.out.println(ans);

 }
}