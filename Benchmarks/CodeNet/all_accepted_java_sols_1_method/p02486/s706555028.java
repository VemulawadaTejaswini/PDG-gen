import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			int i=1,k=1,e=1,a=0;
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