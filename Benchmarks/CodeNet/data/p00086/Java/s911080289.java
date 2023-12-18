import java.util.Scanner;

//Patrol
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int[] a = new int[101];
			while(true){
				int s = sc.nextInt();
				int t = sc.nextInt();
				if((s|t)==0)break;
				a[s]++;
				a[t]++;
			}
			int o = 0;
			for(int s:a)if(s%2==1)o++;
			System.out.println(o==0?"OK":o!=2?"NG":a[1]%2==0||a[2]%2==0?"NG":"OK");
		}
	}
}