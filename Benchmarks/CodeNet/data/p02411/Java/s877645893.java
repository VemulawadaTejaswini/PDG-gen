import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int a,b,c;
		int count =0;
		char test[] = new char[50];
		Scanner sc = new Scanner(System.in);

		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(a==-1 && b==-1 && c==-1)
				break;
			test[count] = Judg(a,b,c);
			count++;
		}
		 for(int i = 0; i<count; i++){
	            System.out.println(test[i]);
	        }

	}
	public static char Judg(int a , int b, int c) {
		if (a+b < 30||a==-1||b==-1)
		return 'F';
		else if(a + b >=80)
			return 'A';
		else if(a + b >=65 && a+b < 80)
			return 'B';
		else if ((a+b >=50 && a+b <65)||(c>=50))
			return 'C';
		else if ((a+b >=30 && a+b <50)&&(c<50))
			return 'D';
		else
		    return 'R';
	}
}

