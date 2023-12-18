import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;                      


class Main {

	public enum Alfa{
		a(0),b(1),c(2),d(3),e(4),f(5),g(6),h(7),i(8),j(9),k(10),l(11),m(12),n(13),
		o(14),p(15),q(16),r(17),s(18),t(19),u(20),v(21),w(22),x(23),y(24),z(25) ;//アルファベットに数字を対応させる

		private final int id;
		private Alfa(final int id){this.id=id;}//数字の習得
		
		

		public int getId(){
			return id;
		}

		public static Alfa getById(int id) {//指定された数字の列挙子を返す
			for (Alfa p : Alfa.values()) {
				if (p.getId() == id) return p;
			}
			return null;
		}

	}


	public static void main(String[] args) {   
	     
		Scanner scanner = new Scanner(System.in);
		
		String x="";
		while (scanner.hasNextLine()) {

			String y= scanner.nextLine();
			x=x+y;
		if (y.length() == 0) { 
			break;
		}}
		
		String x1= x.toLowerCase();//入力された文字をすべて小文字に変換
		char[] a; 
		a=new char[x.length()];//配列の最大値は文字数		
		
		String[] st;
		st=new String[x.length()];
		
		String[] st2;
		st2=new String[x.length()];
		int t=0;
		
		int[] sum;//この配列の番号と列挙型のアルファベットがリンクしている。
		sum=new int[Alfa.values().length];
		
		
		
		
		for(int i=0;i < x.length();i++){//桁数分くりかえす
			a[i]=x1.charAt(i);//文字列を1文字ずつ配列に格納
			st[i]=String.valueOf(a[i]);//String型に変換
			
			String regex = "^[a-z]+$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(st[i]); //正規表現にマッチするか検査

			if (m.matches()) {
				st2[t]=st[i];//マッチした場合st2に格納
				t=t+1;//マッチした数だけループの回数を制御する
			}
		}
		
		for(int i=0;i < t;i++){
			
		Alfa frt=Alfa.valueOf(st2[i]);
        sum[frt.ordinal()]=sum[frt.ordinal()]+1; //配列sumの各アルファベットに対応した位置に格納
      
		}
		
		for(int i=0;i < Alfa.values().length;i++){
			System.out.println(Alfa.getById(i)+" : "+sum[i]);
			
		}
		
		
		scanner.close();

	


}
}


