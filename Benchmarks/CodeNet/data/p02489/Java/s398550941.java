import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int a[] = new int[100];
		int c=1;
		int i=0;
		Scanner s = new Scanner(System.in);
		
		while(c!=0){
			c = s.nextInt();
			a[i]=c;
			i++;
		}

		for(int j=0;j<i-1;j++){
			System.out.printf("Case "+(j+1)+": "+a[j]+"\n");
		}
	}
}