import java.util.*;

class Main {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()) {

	    String[] line = sc.nextLine().split(" ");

	    int n = Integer.parseInt(line[0]);
	    int r = Integer.parseInt(line[1]);

	    if(n == 0 && r == 0) break;

	    int deck[] = new int[n];

	    for(int i = 0; i < n; i++) {

		deck[i] = n - i;

	    }

	    for(int i = 0; i < r; i++) {

		String[] l = sc.nextLine().split(" ");
		int q = Integer.parseInt(l[0]);
		int c = Integer.parseInt(l[1]);

		int top[] = new int[c];

		for(int j = 0; j < c; j++) {

		    top[j] = deck[q-1+j];

		}

		// for(int j = 0; j < top.length; j++) {

		//     System.out.print(top[j]);

		// }
		// System.out.println();

		int bottom[] = new int[q];

		for(int j = 0; j < q-1; j++) {

		    bottom[j] = deck[j];

		}

		// for(int j = 0; j < q-1; j++) {

		//     System.out.print(bottom[j]);

		// }
		// System.out.println();

		for(int j = 0; j < c; j++) {

		    deck[j] = top[j];

		}

		for(int j = 0; j < q-1; j++) {
		    
		    deck[c+j] = bottom[j];

		}

		// for(int j = 0; j < deck.length; j++) {

		//     System.out.print(deck[j]);
				
		// }
		// System.out.println();

	    }

	    System.out.println(deck[0]);


	}

    }

}