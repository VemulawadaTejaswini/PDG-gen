import java.util.Scanner;

class Main{
	static public void main (String args[]){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int i = 0;

		while(true){
			if(c%a == 0){
				i++;
			}
			a++;
			if(a>b)
				break;
		}
		System.out.println(i);
	}
}