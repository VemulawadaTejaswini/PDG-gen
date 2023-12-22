import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> n = new ArrayList<Integer>();
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> count = new ArrayList<Integer>();

		 for(int i=0;;i++){
			 n.add(i, scan.nextInt());
			 x.add(i, scan.nextInt());
			 count.add(i, 0);
			 if(n.get(i)==0 && x.get(i)==0) break;
		 }



   for(int h=0;;h++){
		 if(n.get(h)==0 && x.get(h)==0) break;
		 for(int i=1;i<=n.get(h);i++){
			 for(int j=i;j<=n.get(h);j++){
				 if(i==j)continue;
				 for(int k=j;k <= n.get(h);k++){
					 if(i==k || j==k)continue;
					 if(i+j+k == x.get(h)) count.set(h, count.get(h)+1 );
				 }
			 }
		 }

			System.out.println(count.get(h));
   }
	}

}