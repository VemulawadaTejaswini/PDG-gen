import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main(){
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			int m = cin.nextInt();
			if(n==0) break;
			boolean check[] =new boolean[1000];
			int i,j;
			int now = n-1;
			for(i=0;i<n-1;i++){
				int nokori = n-i;
				int need = m % nokori;
				if(need==0) need = nokori;
				for(j=0;j<need;j++){
					now = (now+1)%n;
					if(check[now])j--;
				}
				check[now] = true;
			}
			for(i=0;i<n-1;i++){ if(!check[i]) System.out.println(i + 1);}
		}
	}
}