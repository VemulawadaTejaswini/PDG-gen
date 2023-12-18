import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int r = sc.nextInt();
			if((n|r)==0)break;
			int p, c, t;
			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int i=0;i<n;i++){
				list.add(i+1);
			}
			for(int i=0;i<r;i++){
				p = sc.nextInt();
				c = sc.nextInt();
				for(int j=0;j<c;j++){
					t = list.get(n-p-c+1);
					list.remove(n-p-c+1);
					list.add(t);
				}
			}
			System.out.println(list.get(n-1));
		}
	}
}