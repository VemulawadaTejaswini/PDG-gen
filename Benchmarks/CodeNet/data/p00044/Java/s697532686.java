import java.util.*;

public class Main {
	
	static boolean judge(int i){
		for(int j=2; j<i; j++)
			if(i%j==0) return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int down=0; int up=0;
			for(int i=0; i<=50021; i++){
				if(judge(i)){
					if(i > down && i < n) down = i;
					if(i > n){ up = i; break;}
				}
			}
			System.out.printf("%d %d%n",down,up);
		}
	}

}