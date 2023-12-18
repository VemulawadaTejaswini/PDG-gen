//API???????????????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
 public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Card[] CardA = new Card[n];
		for(int i = 0; i < n; i++){
			CardA[i] = new Card();
			String[] str = br.readLine().split(" ");
			CardA[i].sort = str[0];
			CardA[i].num = Integer.parseInt(str[1]);
			CardA[i].index = i;
		}
		QuickSort(CardA, 0, n - 1);
		boolean stable = true;
		stable = isStable(CardA, n);
		
		if(stable) System.out.println("Stable");
		else System.out.println("Not stable");

		for(int i = 0; i < n; i++){
			System.out.println(CardA[i].sort + " " + CardA[i].num);
		}
	}

	public static void QuickSort(Card[] A, int l, int r){
		if(l >= r) return;
		int p = Partition(A, l, r);
		QuickSort(A, l, p - 1);
		QuickSort(A, p + 1, r);
	}

	public static int Partition(Card[] A, int l, int r){
		int threshold = A[r].num;
		int i = l - 1;
		for(int j = l; j < r; j++){
			if(A[j].num <= threshold){
				i++;
				exchange(A, i, j);
			}
		}
		i++;
		exchange(A, i, r);

		return i;
	}

	public static void exchange(Card[] A, int i, int j){
		Card tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	
	static boolean isStable(Card[] A, int n){
		boolean flag = true;
		int cnt;
		int[] Sort = new int[4]; 
		for(int i = 0; i < n; i+= cnt){
			Sort[0] = A[i].index;
			cnt = 1;
			for(;i + cnt < n && A[i].num == A[i + cnt].num; cnt++){
				Sort[cnt] = A[i + cnt].index;
			}
			if(cnt != 1){
				for(int j = 0; j < cnt - 1; j++){
					for(int k = j + 1; k < cnt; k++){
						if(Sort[j] > Sort[k]){
							flag = false;
							break;
						}
					}
					if(!flag) break;
				}
			}
			if(!flag) break;
		}
		return flag;
	}
}

class Card{
	int num;
	String sort;
	int index;
}