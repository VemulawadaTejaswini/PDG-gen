import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> p = new ArrayList<>();
		
		for(int i=11;i<=55555;i+=30){
			boolean ok = true;
			for(int j=2;j*j<=i;j++){
				if(i % j==0){
					ok = false;
					break;
				}
			}
			if(ok)
				p.add(i);
		}
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print(p.get(i)+" ");
		}
		
	}

}
