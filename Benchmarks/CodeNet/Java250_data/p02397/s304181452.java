import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int i=0;
		int x[]=new int[10000];
		int y[]=new int[10000];
		while(true){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();

			if(x[i]==0&&y[i]==0)	break;
			else if(x[i]>y[i]){
				int val=x[i];
				x[i]=y[i];
				y[i]=val;
			}

			i++;
		}

		for(int j=0;j<i;j++)	System.out.println(x[j]+" "+y[j]);
	}
}