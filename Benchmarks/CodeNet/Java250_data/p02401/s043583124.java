import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		List<String> op = new ArrayList<String>();

		 for(int i=0;;i++){
			 a.add(i, scan.nextInt());
			 op.add(i, scan.next());
			 b.add(i, scan.nextInt());
			 if(op.get(i).equals("?")) break;
		 }



		 for(int i=0;;i++){
			 if(op.get(i).equals("?")) break;
			 if(op.get(i).equals("+")) System.out.println(a.get(i)+b.get(i));
			 if(op.get(i).equals("-")) System.out.println(a.get(i)-b.get(i));
			 if(op.get(i).equals("*")) System.out.println(a.get(i)*b.get(i));
			 if(op.get(i).equals("/")) System.out.println(a.get(i)/b.get(i));
		 }
		 //System.out.println(df.format(s)+" "+df.format(a));

	}

}