import java.util.Scanner;

class Main {

    public static void main(String[] av){
	java.util.Scanner sc = new Scanner(System.in);
	//	while(int a < 1 OR 100 < a){
	int a = sc.nextInt();
        int b = sc.nextInt();
  
	int l = 2*a + 2*b;
	int s = a*b;

	System.out.println(s+" "+l);
    }
}

