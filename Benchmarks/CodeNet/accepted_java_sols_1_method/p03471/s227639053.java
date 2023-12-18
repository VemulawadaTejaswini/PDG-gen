import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int Y = scan.nextInt();

		int counta =0;
		int countb =0;
		int countc =0;


		counta = Y /10000;
		countb = (Y - 10000 * counta)/5000;
		countc = ( (Y - 10000 * counta)-(5000*countb) )/1000;



		int countsum = counta + countb + countc;

		//List<Integer> list = new ArrayList<>();
		//List<String> pattern = new ArrayList<>();



		loop: for(int i=counta ; i>=0; i--) {

			int cflag = countc;

			for(int j=countb; j>=0; j-- ) {


				countsum= i+j+cflag;

				//list.add(countsum);

				if(countsum==N) {

				String pat = i + " " + j + " " + cflag;

				System.out.println(pat);

				break loop;

				}

				//pattern.add(pat);

				cflag = cflag + 5;


				if(i==0 && j==0)
				{System.out.println("-1 -1 -1");
				}

			}

			countb = countb + 2;


		}


		/*
		for(int i=0; i<list.size() ;i++) {

			int counter = list.get(i);
			//System.out.println(counter);

			if (counter==N) {

				String ans = pattern.get(i);
				System.out.println(ans);
				break;

			}
			else if(i == list.size()-1) {

				System.out.println("-1 -1 -1");

			}
		}
		*/



	}

}