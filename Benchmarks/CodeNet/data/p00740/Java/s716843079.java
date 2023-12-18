import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int p = scan.nextInt();
			if(n == 0 && p == 0){
				break;
			}
			int[] m = new int[n];
			int i = 0;
			while(true){
				if(i >= n){
					i %= n;
				}
				if(p == 1){
					if(check(m,i)){
						System.out.println(i);
						break;
					}else{
						p--;
						m[i]++;
					}
				}else if(p == 0){
					p = m[i];
					m[i] = 0;
				}else{
					p--;
					m[i]++;
				}
				i++;
			}
		}
	}
	public boolean check(int[] n,int a){
		for(int i = 0;i < n.length;i++){
			if(i == a){
				continue;
			}
			if(n[i] > 0){
				return false;
			}
		}
		return true;
	}
}