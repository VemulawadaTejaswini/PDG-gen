import java.util.Scanner;

//Trading
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t = new int[1001];
		boolean[] f = new boolean[1001];
		while(true){
			String s = sc.nextLine();
			if(s.equals(""))break;
			t[Integer.parseInt(s.split(",")[0])]++;
		}
		while(sc.hasNext()){
			int x = Integer.parseInt(sc.nextLine().split(",")[0]);
			if(t[x]!=0)f[x]=true;
			t[x]++;
		}
		for(int i=0;i<=1000;i++)if(f[i])System.out.println(i+" "+t[i]);
	}
}