import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc;
		String str="";
		String[] kuwasiku;
		int nedan=0;
		int kazu=0;
		int sougaku=0;
		int sousuu=0;
		int kaisu=0;

	sc=new Scanner(System.in);
		while(sc.hasNext()) {
			str=sc.next();
			kuwasiku=str.split(",");
			nedan=Integer.parseInt(kuwasiku[0]);
			kazu=Integer.parseInt(kuwasiku[1]);
			sougaku+=nedan*kazu;
			sousuu+=kazu;
			kaisu++;
		}
		System.out.println(sougaku);
		System.out.println(Math.round(sousuu*1.0/kaisu));
	}
}
