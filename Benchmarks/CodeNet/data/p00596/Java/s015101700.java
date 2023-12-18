import java.util.Scanner;

//Dominoes Arrangement
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] c = new int[7];
			for(int i=0;i<n;i++){
				char[] s = sc.next().toCharArray();
				c[s[0]-'0']++;
				c[s[1]-'0']++;
			}
			int o = 0;
			for(int i=0;i<7;i++)if(c[i]%2==1)o++;
			System.out.println(o==0||o==2?"Yes":"No");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}