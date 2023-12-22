import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
      	int tmp = a;
      	int number = 1 ;
      	while(tmp < b)
        {
          tmp=tmp+(a-1);
          number++;            
        }
      	if (b == 1) System.out.println(0);
        else   	System.out.println(number);
	}
}