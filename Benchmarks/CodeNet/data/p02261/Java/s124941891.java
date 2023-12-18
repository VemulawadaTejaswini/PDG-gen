import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();
	private static final int MAX_NUM = 9;

	public static void main(String[] args) {
		int N = sc.nextInt();

		Card[] C = new Card[N];
		Card[] C_before = new Card[N];
		for(int i=0; i<N; i++) {
			char[] temp = sc.next().toCharArray();
			C[i] = new Card(temp[0], Integer.parseInt("" + temp[1]));
			C_before[i] = new Card(temp[0], Integer.parseInt("" + temp[1]));
		}	
		
		for(int i=0; i<N; i++) {
			for(int j=N-1; j>i; j--) {
				if(C[j].num < C[j-1].num){
					Card temp = C[j];
					C[j] = C[j-1];
					C[j-1] = temp;
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.print("" + C[i].suit +  C[i].num);
			if(i != N-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		boolean flag = true;
		for(int i=1; i<=MAX_NUM; i++) {
			String order_suit = "";
			String order_suit_before = "";
			
			for(int j=0; j<N; j++ ){
				if(C[j].num == i) {
					order_suit += C[j].suit;
				}
				if(C_before[j].num == i) {
					order_suit_before += C_before[j].suit;
				}
			}
			
//			System.out.println(order_suit);
//			System.out.println(order_suit_before);
			
			if(!order_suit.equals(order_suit_before)) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Stable");
		} else {
			System.out.println("Not Stable");
		}
		
		
		for(int i=0; i<N; i++) {
			C[i].suit = C_before[i].suit;
			C[i].num = C_before[i].num;
		}	
		
		for(int i=0; i<N; i++){
			int idx_min = i;
			for(int j=i; j<N; j++){
				if(C[j].num < C[idx_min].num){
					idx_min = j;
				}
			}
			
			if(idx_min != i){
				Card temp = C[i];
				C[i] = C[idx_min];
				C[idx_min] = temp;
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.print("" + C[i].suit +  C[i].num);
			if(i != N-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		flag = true;
		for(int i=1; i<=MAX_NUM; i++) {
			String order_suit = "";
			String order_suit_before = "";
			
			for(int j=0; j<N; j++ ){
				if(C[j].num == i) {
					order_suit += C[j].suit;
				}
				if(C_before[j].num == i) {
					order_suit_before += C_before[j].suit;
				}
			}
			
//			System.out.println(order_suit);
//			System.out.println(order_suit_before);
			
			if(!order_suit.equals(order_suit_before)) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Stable");
		} else {
			System.out.println("Not Stable");
		}
	}
	
	static class Card{
		char suit;
		int num;
		
		public Card(char suit, int num) {
			this.suit = suit;
			this.num = num;
		}
	}

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}