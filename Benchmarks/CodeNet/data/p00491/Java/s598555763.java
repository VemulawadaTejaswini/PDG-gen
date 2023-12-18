import java.util.Scanner;

public class Main {
	static boolean [] whetherFix_ = new boolean [100];
	static int[] plan_ = new int [100];
	static int cnt_ = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0, planNumber, numberOfContinuousDigit, specifiedDigit = 0, maxValue;;
		boolean makeOrderedArrayFlag = false, maxFlag = false;
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		//配列の初期化(予定なしの場合可能な最小値)
		for (int i = 0; i < 100; i++) {
			plan_[i] = 1;
			whetherFix_[i] = false;
		}
		
		//予定を入れる。
		for (int i = 0; i < K; i++) {
			planNumber = sc.nextInt();
			plan_[planNumber-1] = sc.nextInt();
			//System.out.printf("plan[%d] = %d\n",planNumber-1, plan_[planNumber-1]);
			whetherFix_[planNumber-1] = true;
			//System.out.printf("whetherFix[%d] = %b\n",planNumber-1, whetherFix_[planNumber-1]);
		}
		
		//配列の初期最小値を作る
		while (continuousFlag(N, 0) != -1) {
			trinaryUp(N, continuousFlag(N, 0));
		}
		
		if (continuousFlag(N, 0) == -1) {
			count(N);
		}
		
		//すべての桁がtrueになるまで
		while (!completeArray(N)) {
			//1.現在の桁から特定桁をtureでない最近下位桁に変える
			while (whetherFix_[specifiedDigit] && specifiedDigit < N - 1) {
				specifiedDigit++;
			}
			
			//2.特定桁の最大値を格納
			maxValue = returnMaxValue(N, specifiedDigit);
			
			//3.特定桁が最大値になるまでカウントをし続ける
			add1(N, specifiedDigit, maxValue);
			
			//4.最大になったらその桁をture(固定)して1.へ
			whetherFix_[specifiedDigit] = true;
		}
		//System.out.println(cnt_);
	}
	
	//指定桁が渡された値になるまで加算
	static void add1 (int N, int digit, int maxValue) {
		//その桁がその値になるまで加算
		while (plan_[digit] != maxValue) {
			trinaryUp(N, digit);
			count(N);
		}
	}
	
	//配列を3進数として1ずつ増加させる関数(ただし1,2,3の数を使う)
	static void trinaryUp(int N, int digit) {
		//指定桁以下の桁で3連続している部分があれば上位桁から優先的に桁上げしていく
		//ただし連続が発生し、桁上げが必要な場合は最大数でない桁を桁上げ
		//なければ単純に+1
		if (digit == N - 2 || continuousFlag(N, digit) == -1) {
			//第1位が最大値なら最大数でない桁を桁上げ
			//そうでないなら単純に+1
			if (plan_[N - 1] == returnMaxValue(N, N - 1)) {
				int check = N - 2;
				while (whetherFix_[check] || plan_[check] == returnMaxValue(N, check)) {
					check--;
				}
				upDigit(N, check);
			}else {
				upDigit(N, N - 1);
			}
			
		}else  if (continuousFlag(N, digit) == -2) {
			int check = N - 2;
			while (whetherFix_[check] && plan_[check] == returnMaxValue(N, check)) {
				check--;
			}
			upDigit(N, check);
		}else {
			upDigit(N, continuousFlag(N, digit));
		}
	}
	
	//指定桁を桁上げ
	static void upDigit(int N, int p){
		if (p > 1 && p < N - 2) {
			if (forwardDoubleFix(p) || backDoubleFix(p)) {
				plan_[p] += 2;
			}else {
				plan_[p]++;
			}
		}else if (p <= 1) {
			if (forwardDoubleFix(p)) {
				plan_[p] += 2;
			}else {
				plan_[p]++;
			}
		}else {
			if (backDoubleFix(p)) {
				plan_[p] += 2;
			}else {
				plan_[p]++;
			}
		}
		for (int q = p + 1; q < N; q++) {
			if (!whetherFix_[q]) {
				if (q > 1 && plan_[q - 1] == 1 && plan_[q - 2] == 1) {
					plan_[q] = 2;
				}else if (q > 0 && whetherFix_[q + 1] && plan_[q + 1] == 1 && plan_[q - 1] == 1) {
					plan_[q] = 2;
				}else {
					plan_[q] = 1;
				}
			}
		}
	}
	
	//指定された桁が取ることのできる最大値を返す
	static int returnMaxValue(int N, int digit){
		if (digit > 1 && digit < N - 2) {
			if (minValue(digit)) {
				return 1;
			}else if (back(digit) || forward(digit) || bothSides(digit)) {
				return 2;
			}else {
				return 3;
			}
		}else if (digit == 0) {
			if (forward(digit)) {
				return 2;
			}else {
				return 3;
			}
		}else if (digit == 1) {
			if (forward(digit) || bothSides(digit)) {
				return 2;
			}else {
				return 3;
			}
		}else if (digit == N - 2) {
			if (back(digit) || bothSides(digit)) {
				return 2;
			}else {
				return 3;
			}
		}else {
			if (back(digit)) {
				return 2;
			}else {
				return 3;
			}
		}
	}
	
	//配列すべてがtrueになったら真を、そうでないなら偽を
	static boolean completeArray(int N){
		boolean flag = true;
		for (int i = 0; i < N; i++) {
			if (!whetherFix_[i]) {
				flag = false;
			}
		}
		return flag;
	}
	
	//3連続している部分があるか探し、あればその中の変更可能最小桁数を、無ければ-1を、3が連続している場合は-2を返す
	static int continuousFlag(int N, int digit){
		for (int i = digit; i < N - 2; i++) {
			if (plan_[i] == plan_[i + 1] && plan_[i + 1] == plan_[i + 2]) {
				if (plan_[i] != 3) {
					if (!whetherFix_[i + 2]) {
						return i + 2;
					}else if (!whetherFix_[i + 1]) {
						return i + 1;
					}else {
						return i;
					}
				}else {
					return -2;
				}
			}
		}
		return -1;
	}
	
	//下位2桁が固定値の3か
	static boolean forward(int p){
		if (whetherFix_[p + 1] && whetherFix_[p + 2] && plan_[p + 1] == 3 && plan_[p + 2] == 3) {
			return true;
		}
		return false;
	}
	
	//上位2桁が3か
	static boolean back(int p){
		if (plan_[p - 1] == 3 && plan_[p - 2] == 3) {
			return true;
		}
		return false;
	}
	
	//隣接する上位桁が3で下位桁が固定の3か
	static boolean bothSides(int p){
		if (whetherFix_[p + 1] && plan_[p + 1] == 3 && plan_[p - 1] == 3) {
			return true;
		}
		return false;
	}
	
	//上位2桁が3で下位2桁が固定の2、もしくは上位2桁が固定の2で下位2桁が固定の3か
	static boolean  minValue(int p){
		if (back(p) && whetherFix_[p + 1] && whetherFix_[p + 2] && plan_[p + 1] == 2 && plan_[p + 2] == 2) {
			return true;
		}else if (forward(p) && whetherFix_[p - 1] && whetherFix_[p - 2] && plan_[p - 1] == 2 && plan_[p - 2] == 2) {
			return true;
		}
		return false;
	}
	
	//上位2桁が固定値の2か
	static boolean backDoubleFix(int p){
		if (plan_[p - 1] == plan_[p - 2] && plan_[p - 1] == 2) {
			return true;
		}
		return false;
	}
	
	//下位2桁が固定値の2か
	static boolean forwardDoubleFix(int p){
		if (whetherFix_[p + 1] && whetherFix_[p + 2] && plan_[p + 1] == plan_[p + 2] && plan_[p + 1] == 2) {
			return true;
		}
		return false;
	}
	
	//カウント
	static void count(int N){
		cnt_++;
		
		if (cnt_ > 10000) {
			cnt_ /= 10000;
		}
		//confirm(N);
	}
	
	//配列確認用
	static void confirm(int N){
		for (int j = 0; j < N; j++) {
			System.out.printf("%d ", plan_[j]);
			
		}
		System.out.println("");
	}
}