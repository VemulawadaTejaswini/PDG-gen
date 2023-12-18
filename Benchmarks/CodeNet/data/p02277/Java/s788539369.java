
import java.util.Scanner;


class  Card{
	int number;
	String design;
	int value;
	public Card(int n,String d,int v) {
		// TODO Auto-generated constructor stub
		this.number=n;
		this.design=d;
		this.value=v;
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		Card[] A=new Card[n];
		for(int i=0;i<n;i++){
			A[i]=new Card(i, scanner.next(),scanner.nextInt());
		}
		quicksort(A,0,n-1);
		
		int i=1,j,f=1;
		while(i<n){
			j=0;
			while((f>0)&&(j<i)){
				if((A[i].value==A[j].value)&&(A[i].number<A[j].number)){
					f=0;
					System.out.println("Not stable");
				}
				j++;
			}
			i++;
		}
		if(f>0){
			System.out.println("Stable");
		}
		for(i=0;i<n;i++)
			System.out.println(A[i].design+" "+A[i].value);
	}

	private static void quicksort(Card[] A, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high){
			int q=partition(A,low,high);
			quicksort(A, low, q-1);
			quicksort(A, q+1, high);
		}
	}

	private static int partition(Card[] A, int low, int high) {
		// TODO Auto-generated method stub
		int x=A[high].value;
		int i=low-1;
		for(int j=low;j<high;j++){
			if(A[j].value<=x){
				i++;
				Card m=A[i];
				A[i]=A[j];
				A[j]=m;
			}
		}
		Card m=A[i+1];
		A[i+1]=A[high];
		A[high]=m;
		return i+1;
	}

}

