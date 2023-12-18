import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //出来上がる焼き鳥の本数
		int Kushi = 2*N;	//串の本数
		ArrayList<Integer> L = new ArrayList<Integer>(); //串の長さ一覧
		int KK = 0;

		for(int i=0; i < Kushi; i++){
			L.add(sc.nextInt());
		}
		Collections.sort(L); 

		for(int i=0; i<Kushi; i+= 2){
			KK += L.get(i);
		}
		
		System.out.println(KK);
	}
}