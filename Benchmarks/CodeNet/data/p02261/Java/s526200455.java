import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String x="0";
		Card[] C = new Card[N];
		Card[] CB = new Card[N];
		Card[] CS = new Card[N];
		for(int i=0;i<N;i++){
			String str = sc.next();
			int a=str.charAt(1)-x.charAt(0);
			C[i]=new Card(str.charAt(0),a);
			CB[i]=C[i];
			CS[i]=C[i];
		}
		
		BubbleSort(CB);
		SelectionSort(CS);
		for(int i=0;i<N;i++){
			if(i==N-1){
				CB[i].print();
				System.out.println();
			}else{
				CB[i].print();
				System.out.print(" ");
			}
		}
		if(Scheck(C,CB)){
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}
		for(int i=0;i<N;i++){
			if(i==N-1){
				CS[i].print();
				System.out.println();
			}else{
				CS[i].print();
				System.out.print(" ");
			}
		}
		if(Scheck(C,CS)){
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}

	}
	
	static void BubbleSort(Card[] C){
		for(int i=0;i<C.length;i++){
			for(int j=C.length-1;j>i;j--){
				if(C[j].value<C[j-1].value){
					Card t=C[j];
					C[j]=C[j-1];
					C[j-1]=t;
				}
			}
		}
	}
	
	static void SelectionSort(Card[] C){
		for(int i=0;i<C.length;i++){
			int mini=i;
			for(int j=i;j<C.length;j++){
				if(C[j].value<C[mini].value){
					mini=j;
				}
			}
			if(i!=mini){
				Card t=C[i];
				C[i]=C[mini];
				C[mini]=t;
			}
		}
	}

	static boolean Scheck(Card[] A,Card[] B){
		boolean check=true;
		for(int i=1;i<B.length;i++){
			if(B[i-1].value==B[i].value){
				int f=0;
				int e=0;
				for(int j=0;j<A.length;j++){					
					if(B[i-1]==A[j]){
						f=j;
					}
					if(B[i]==A[j]){
						e=j;
					}
				}
				if(e<f){
					check=false;
					break;
				}
			}
		}
		return check;
	}
}

class Card{
	char suit;
	int value;
	Card(char a,int b){
		suit=a;
		value=b;
	}
	public void print(){
		System.out.printf("%c%d",suit,value);
	}
}