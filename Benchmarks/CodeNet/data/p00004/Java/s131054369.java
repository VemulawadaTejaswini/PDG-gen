import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/*
 *  連立方程式
        ax + by = c
        dx + ey = f
	の解、x, y を出力して終了するプログラムを作成して下さい。
	a, b, c, d, e, f はそれぞれ、 -1000 以上 1000 以下の実数とし、連立方程式の解が一意に存在するように与えれれるものとします。
	
	Input
	複数のデータセットが与えられます。入力の最後まで処理して下さい。１つのデータセットが１行に与えられます。
	１つのデータセットに a, b, c, d, e, f が１つのスペースで区切られて与えられます。
	
	Output
	各データセットに対して、x, y を１つのスペースで区切って１行に出力して下さい。
	各値は小数点以下第３位まで出力して下さい。小数点以下第４位を四捨五入して下さい。 
	
	ｘ，ｙは以下の解法で求める
	x = (ce - fb) / (ae -bd)
	y = (cd - fa) / (bd - ae)

 */
public class SimultaneousEquation0004 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		try {
			while((line = br.readLine()) != null) {
				line = line.trim();
				String[] values = line.split("\\s");
				if(values.length != 6) System.exit(-1);
				int[] value = new int[6];
				int i = 0;
				for(String s : values) {
					value[i] = Integer.parseInt(s);
					if(value[i] < -1000 || value[i] > 1000) System.exit(-1);
					i++;
				}
				
				int a = value[0];
				int b = value[1];
				int c = value[2];
				int d = value[3];
				int e = value[4];
				int f = value[5];
				
				double x = (double)(c*e - f*b) / (a*e - b*d);
				double y = (double)(c*d - f*a) / (b*d - a*e);
				
				BigDecimal bdX = new BigDecimal(x);
				BigDecimal bdY = new BigDecimal(y);
				bdX = bdX.setScale(3, BigDecimal.ROUND_HALF_UP);
				bdY = bdY.setScale(3, BigDecimal.ROUND_HALF_UP);

				System.out.println(bdX + " " + bdY);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}