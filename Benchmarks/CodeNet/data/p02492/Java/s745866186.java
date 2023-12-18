import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a[]=new int[1000];
		int b[]=new int [1000];
		int answer[]=new int [1000];
		String op[]=new String[1000];
		int i;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<1000;i++){
			a[i]=sc.nextInt();
			op[i]=sc.next();
			b[i]=sc.nextInt();

			 if(op[i].equals("+"))
				answer[i]=a[i]+b[i];

			 else if(op[i].equals("-"))
					answer[i]=a[i]-b[i];

			 else if(op[i].equals("*"))
					answer[i]=a[i]*b[i];

			 else if(op[i].equals("/"))
					answer[i]=a[i]/b[i];

			 else if(op[i].equals("?"))
				break;

		}

		sc.close();
		for(int j=0;j<i;j++){
			System.out.println(answer[j]);
		}




		}
	}