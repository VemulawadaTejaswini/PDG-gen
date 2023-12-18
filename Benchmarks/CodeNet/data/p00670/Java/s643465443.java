import java.util.Scanner;

//Spellcasters
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), S = sc.nextInt();
			if((n|S)==0)break;
			int[] r = new int[101];
			while(n--!=0)r[sc.nextInt()]++;
			int res = 0;
			for(int i=1;i<101;i++)for(int j=i;j<101;j++){
				if(i==j&&r[i]<2)continue;
				if(S<i*j)res+=r[i]*r[j];
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}