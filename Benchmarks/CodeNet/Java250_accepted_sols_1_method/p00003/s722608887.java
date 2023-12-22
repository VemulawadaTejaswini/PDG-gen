import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		while(num != 0){
			ArrayList<Integer> tri = new ArrayList<Integer>();
			tri.add(sc.nextInt());
			tri.add(sc.nextInt());
			tri.add(sc.nextInt());
			Collections.sort(tri);
			if((Math.pow(tri.get(0),2)+Math.pow(tri.get(1),2))!=Math.pow(tri.get(2),2)){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
			num--;
		}
		sc.close();
	}
}