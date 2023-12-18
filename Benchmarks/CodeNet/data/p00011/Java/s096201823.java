import java.util.Scanner;


public class Main{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int w=Integer.valueOf(scan.nextLine());
	int n=Integer.valueOf(scan.nextLine());
	int[] a=new int[n];
	int[] b=new int[n];
	int[] lots=new int[w+1];
	int temp;

	for(int i=1;i<lots.length;i++){
		lots[i]=i;
	}
	for(int i=0;i<n;i++){
		String str=scan.nextLine();
		String[] s=str.split(",");
		a[i]=Integer.valueOf(s[0]);
		b[i]=Integer.valueOf(s[1]);

		temp=lots[a[i]];
		lots[a[i]]=lots[b[i]];
		lots[b[i]]=temp;
	}
	for(int i=1;i<lots.length;i++){
		System.out.println(lots[i]);
	}


	}

}