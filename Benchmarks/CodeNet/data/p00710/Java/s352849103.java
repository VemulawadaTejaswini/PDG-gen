import java.util.*;

public class Main {

	static int[] swap(int[] card,int n,int p,int c){
		int tmp [];
		tmp=card.clone();
		for(int i=n;i>n-p-c+1;i--){
			if(i>n-p+1)
				tmp[i-c]=card[i];
			else
				tmp[i+p-1]=card[i];
		}

		return tmp;
	}

	public static void main(String[] args){
	int card [];
	int i;

	Scanner s = new Scanner(System.in);
	while(true){
		int n = s.nextInt();
		int r = s.nextInt();

		if(n==0 && r==0) break;
		card = new int[n+1];

		for(i=0;i<n+1;i++)
			card[i]=i;

		for(i=0;i<r;i++){
			int p = s.nextInt();
			int c = s.nextInt();

			card=swap(card,n,p,c);
		}

		System.out.println(card[n]);

	}

	}
}