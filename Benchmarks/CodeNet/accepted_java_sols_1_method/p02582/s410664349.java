import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		ArrayList<Integer> c = new ArrayList<>();
		c.add(0);
		int j=0;
		for(int i=0;i<3;++i){
			if(str.charAt(i)=='R'){
				c.set(j, c.get(j)+1);
			}
			if(str.charAt(i)=='S'){
				j++;
				c.add(0);
			}
		}
		System.out.println(Collections.max(c));
	}
}

