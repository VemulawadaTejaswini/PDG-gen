import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("\n");
		String input="";
		String[] tangos;
		List<Integer> momo=new ArrayList<Integer>();
		List<Integer> ringo=new ArrayList<Integer>();
		int momokazu=0;
		int ringokazu=0;

		while(sc.hasNext()) {
			input=sc.next();
			input=input.substring(0,input.length()-2);
			tangos=input.split(" ");

			for(int i=0; i<tangos.length; i++) {
				if(tangos[i].equals("apple")) {
					ringo.add(i);
					ringokazu++;
				}
				else if(tangos[i].equals("peach")) {
					momo.add(i);
					momokazu++;
				}
			}

			for(int i=0; i<ringokazu; i++) {
				tangos[ringo.get(i)]="peach";
			}
			for(int i=0; i<momokazu; i++) {
				tangos[momo.get(i)]="apple";
			}

			String motodoori="";
			for(int i=0; i<tangos.length-1; i++) {
				motodoori=motodoori+tangos[i]+" ";
			}
			motodoori=motodoori+tangos[tangos.length-1]+".";
			System.out.println(motodoori);
		}
	}
}
