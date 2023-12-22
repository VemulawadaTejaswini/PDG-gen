import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] card=new int[101];
		int a=0,b=0;
		for(int i=0;i<n;i++) {
			card[i]=sc.nextInt();
		}
		int max=0,task=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(card[i]>card[j]) {
					task=card[j];
					card[j]=card[i];
					card[i]=task;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(i%2==0)	a+=card[i];
			else			b+=card[i];
		}
		System.out.println(a-b);

	}

}