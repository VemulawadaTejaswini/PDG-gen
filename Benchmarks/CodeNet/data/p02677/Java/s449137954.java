import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int jisin_nagasa = sc.nextInt();
		int hunsin_nagasa = sc.nextInt();
		int jisin_kakudo = sc.nextInt();
		int hunsin_kakudo = sc.nextInt();

		int kakudo_sa = 0;

		if (jisin_kakudo > hunsin_kakudo) {
			kakudo_sa = jisin_kakudo - hunsin_kakudo;
		} else {
			kakudo_sa = hunsin_kakudo - jisin_kakudo;
		}

		int tanten_nagasa = 0;

		double b = jisin_nagasa;	//1辺目
		double c = hunsin_nagasa;	//2辺目

		int e = kakudo_sa;			//間の角度

		double r=Math.sqrt(Math.pow(b,2)+Math.pow(c,2)-2*b*c*Math.cos(Math.toRadians(e)));

		DecimalFormat m = new DecimalFormat("#########,##########");
		String g = m.format(r);

		double o = 0;
		try {
			o = Double.parseDouble(g);
		} catch (Exception f){
			
		}

		//この時点でoに数値が入っている
		System.out.println(o);
	}
}