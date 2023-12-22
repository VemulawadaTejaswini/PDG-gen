import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int rept = in.nextInt();
		for(int loop=0; loop<rept; loop++){
			String train = in.next();
			HashSet<String> set = new HashSet<String>();
			int n = train.length();
			for(int i=1; i<n; i++){
				String pre = train.substring(0,i);
				String post= train.substring(i);
				String rpre = new StringBuffer(pre).reverse().toString();
				String rpost = new StringBuffer(post).reverse().toString();
				set.add(pre.concat(post));
				set.add(pre.concat(rpost));
				set.add(rpre.concat(post));
				set.add(rpre.concat(rpost));
				set.add(post.concat(pre));
				set.add(post.concat(rpre));
				set.add(rpost.concat(pre));
				set.add(rpost.concat(rpre));
			}
			System.out.println(set.size());
		}
	}

}