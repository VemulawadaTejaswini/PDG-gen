import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
		int K = sc.nextInt();
		LinkedList<Integer> Nbook = new LinkedList<Integer>();
		LinkedList<Integer> Mbook = new LinkedList<Integer>();
		int sumtimeN = 0;
		int sumtimeM = 0;
		int count = 0;
		for(int i = 0; i < N; i++) {
			Nbook.add(sc.nextInt());
		}
		for(int j = 0; j < M; j++) {
			Mbook.add(sc.nextInt());
		}

		while (K > 0){
		if(Mbook.size() == 0){
			if(K - Nbook.get(0) >= 0){
			K -= Nbook.get(0);
			Nbook.remove(0);
			count++;
			}
			else if(K - Nbook.get(0) < 0){
				K = 0;
			}
		}
		else if(Nbook.size() == 0){
			if(K - Mbook.get(0) >= 0){
			K -= Mbook.get(0);
			Mbook.remove(0);
			count++;
			}
			else if(K - Mbook.get(0) < 0){
				K = 0;
		}
		}
		else if(Nbook.get(0) < Mbook.get(0)){
			if(K - Nbook.get(0) >= 0){
			K -= Nbook.get(0);
			Nbook.remove(0);
			count++;
			}
			else if(K - Nbook.get(0) < 0){
				K = 0;
			}
		}
		else if(Nbook.get(0) > Mbook.get(0)){
			if(K - Mbook.get(0) >= 0){
			K -= Mbook.get(0);
			Mbook.remove(0);
			count++;
			}
			else if(K - Mbook.get(0) < 0){
				K = 0;
		}
		}
		else if(Nbook.get(0) == Mbook.get(0)){
			for(int k = 0; k < Math.min(Nbook.size(), Mbook.size()); k++) {
				sumtimeN += Nbook.get(k);
				sumtimeM += Mbook.get(k);
				if(sumtimeN < sumtimeM){
					if(K - Nbook.get(0) >= 0){
					K -= Nbook.get(0);
					Nbook.remove(0);
					sumtimeN = 0; sumtimeM = 0;
					count++;
					break;
					}
					else if(K - Nbook.get(0) < 0){
						K = 0;
					}
				}
				else if(sumtimeN > sumtimeM){
					if(K - Mbook.get(0) >= 0){
					K -= Mbook.get(0);
					Mbook.remove(0);
					sumtimeN = 0; sumtimeM = 0;
					count++;
					break;
					}
					else if(K - Mbook.get(0) < 0){
						K = 0;
				}
				}
			}
		}
	}
	System.out.println(count);
}

}