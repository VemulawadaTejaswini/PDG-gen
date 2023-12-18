import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int k = scan.nextInt();
			if(n == 0 && k == 0){
				break;
			}
			int[] s = new int[k];
			for(int i = 0;i < k;i++){
				s[i] = scan.nextInt();
			}
			boolean fl = true;
			for(int i = 0;i < n && fl;i++){
				for(int j = 0;j < k;j++){
					s[j] -= scan.nextInt();
					if(s[j] < 0){
						fl = false;
						break;
					}
				}
			}
			System.out.println((fl)?"Yes":"No");
		}
	}
}