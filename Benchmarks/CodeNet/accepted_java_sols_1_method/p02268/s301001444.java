import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int S[] = new int[n];
	for(int i = 0;i < n;i++) S[i] = sc.nextInt();
	int q = sc.nextInt();
	int T[] = new int[q];	
	for(int i = 0;i < q;i++) T[i] = sc.nextInt();
	int cnt = 0;
	for(int i = 0;i < q;i++){
		int left = 0;
		int right = S.length;
		int mid = 0; 
		while(left < right){
		    mid = (left + right) / 2;
		    if(T[i] == S[mid]){
			cnt++;
			break;
		    }
		    if(T[i] > S[mid]){
			left = mid + 1;
		    }
		    else if(T[i] < S[mid]){
			right = mid;
		    }
		}
	}
	System.out.println(cnt);
    }
}

