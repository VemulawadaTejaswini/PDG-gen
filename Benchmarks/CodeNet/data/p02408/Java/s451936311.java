import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count,num;;
		String Pattern;
		List<Integer> S = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0));
		List<Integer> H = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0));
		List<Integer> C = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0));
		List<Integer> D = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0));
		count = sc.nextInt();

		for(int i=0; count>i; i++){
			Pattern = sc.next();
			num = sc.nextInt();
			switch (Pattern){
			case "S":
				S.set(num-1,num);
				break;
			case "H":
				H.set(num-1,num);
				break;
			case "C":
				C.set(num-1,num);
				break;
			case "D":
				D.set(num-1,num);
				break;
			default:
				break;
			}

		}
		numCheck("S",S);
		numCheck("H",H);
		numCheck("C",C);
		numCheck("D",D);
		

	}

	private static void numCheck(String P,List<Integer> Pattern) {
		for(int i =1; i<=13; i++) {
			int n = Pattern.indexOf(i);
			if(n == -1) {
				System.out.println(P+" "+i);
			}
		}

	}
}



