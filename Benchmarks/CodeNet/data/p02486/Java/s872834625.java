import java.util.*;

public class Main {


	public static void main(String[] args) {
		int i,k,e,a=0;
		Scanner s = new Scanner(System.in);
		while(true){
			int n = s.nextInt();
			int x = s.nextInt();
			if(n == 0 && x == 0) break;
		
			
			for(i=1; i<=n; i++){
				for(k=i+1; k<=n; k++){
					for(e=k+1; e<=n; e++){
						if(i != k && k != e && e != i && i + k + e == x) a++;
					}
				}
			}
		System.out.println(a);
		}

	}

}