import java.util.*;

public class Main{
	static ArrayList<Integer[]> fr = new ArrayList<Integer[]>();
	static ArrayList<Integer[]> to = new ArrayList<Integer[]>();
	private static final Scanner scan = new Scanner(System.in);
	static int count = 0;

	public static void main(String[] args){
		
		for(;;){
			int n = scan.nextInt();
			int s = scan.nextInt();
			if(n == 0 && s == 0)break;
			count = 0;

			Integer[] ne = new Integer[3];
			ne[0] = 0;
			ne[1] = n;
			ne[2] = s;
			fr.add(ne);
			for(;;){
				if(fr.size() == 0)break;
				for(Integer[] sd : fr){
					if(sd[0] > 9 || sd[1] == 0 || sd[0] > sd[2]){
						continue;
					}
					if(sa[1] == 1 && sd[0] == sd[2])count++;
					Integer[] ne1 = new Integer[3];
					Integer[] ne2 = new Integer[3];
					ne1[0] = sd[0]+1;
					ne1[1] = sd[1]-1;
					ne1[2] = sd[2] - sd[0];
					ne2[0] = sd[0]+1;
					ne2[1] = sd[1];
					ne2[2] = sd[2];
					to.add(ne1);
					to.add(ne2);
				}
				fr.clear();
				for(Integer[] q : to){
					fr.add(q);
				}
				to.clear();
			}
			System.out.printf("%d\n", count);
		}
	}
}