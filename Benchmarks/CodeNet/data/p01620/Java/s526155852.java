import java.util.*;


public class Main {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new A().doIt();
	}
	public class A {
		Scanner sc = new Scanner(System.in);

		

		


		void doIt(){

//			for(char A = 'A'; A <= 'z'; A++){
//				int a = A;
//				System.out.print(a+" ");
//				System.out.println(A);
//				
//				
//			}

			while(true){
				Queue<Integer> q = new LinkedList<Integer>(); 
				int n = sc.nextInt();
				if(n == 0)break;
				for(int i = 0; i < n; i++){
					int k = sc.nextInt();
					q.add(k);
				}
				String s = sc.next();
				char c[] = s.toCharArray();
				char result[] = s.toCharArray();

				
				for(int i = 0; i < c.length; i++){
					int contentQ = q.remove();
					char tmp = (char) (c[i] - (contentQ));
					if('a' <= c[i] && tmp <= 'Z') tmp -= 6;
					if(tmp > 'z')tmp -= 'z';
					if(tmp < 'A')tmp += 58;
					if(tmp > 'Z' && tmp < 'a')tmp -= 6;
					q.add(contentQ);
					result[i] = tmp;
				}

				for(char out : result){
					System.out.print(out);
				}
				System.out.println();
			}
		}

	}
}