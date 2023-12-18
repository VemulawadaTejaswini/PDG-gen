import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a[]=new int[20000];
		int b[]=new int[20000];
		String op1;
		int val[]=new int[20000];

		int i=0;
		while(true){
			a[i]=sc.nextInt();
			op1=sc.next();
			b[i]=sc.nextInt();

			char op2=op1.charAt(0);

			if(op2=='?')	break;
			else{
				switch(op2){
				case '+':
					val[i]=a[i]+b[i];
					break;

				case '-':
					val[i]=a[i]-b[i];
					break;

				case '*':
					val[i]=a[i]*b[i];
					break;

				case '/':
					val[i]=a[i]/b[i];
					break;
				}
			i++;
			}
		}

		for(int j=0;j<i;j++)	System.out.println(val[j]);
	}
}