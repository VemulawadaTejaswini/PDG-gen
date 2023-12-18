//Volume5-0513
import java.util.Scanner;

class Main {

	private static int   n,len;
	private static int[] card;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		n    = sc.nextInt();
		len  = n*2;
		card = new int[len];
		init();
		int m=sc.nextInt();
		int k;
		while(m-- > 0){
			k = sc.nextInt();
			if   (k==0){riffle();}
			else       {cut(k)  ;}
		}
		for(int i:card){System.out.println(i);}
	}

	private static void init(){
		for(int i=0;i<card.length;i++){
			card[i] = i+1;
		}
	}

	private static void cut(int k){
		int[] tmp = new int[card.length];
		int i=0;
		for(int j=k;j<card.length;i++,j++){
			tmp[i] = card[j];
		}
		for(int j=0;j<k;i++,j++){
			tmp[i] = card[j];
		}
		card = tmp;
	}

	private static void riffle(){
		int[] tmp = new int[len];
		for(int i=0,j=0;j<n;i+=2,j++){
			tmp[i]   = card[j];
			tmp[i+1] = card[j+n];
		}
		card = tmp;
	}
}