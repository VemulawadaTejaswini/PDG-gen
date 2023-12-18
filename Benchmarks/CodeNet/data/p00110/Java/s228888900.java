import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.text.ParseException;

public class Main {

	public static final String MASK = "X";

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		MessageFormat format = new MessageFormat("{0}+{1}={2}");

		while ((line = br.readLine()) != null) {

			Object[] o = format.parse(line);
			String strl = (String) o[0];
			String strr = (String) o[1];
			String stra = (String) o[2];

			int startNum = 0;
			if (strl.indexOf(MASK) == 0 || strr.indexOf(MASK) == 0
					|| stra.indexOf(MASK) == 0) {
				startNum = 1;
			}

			strl = new StringBuilder(strl).reverse().toString();
			strr = new StringBuilder(strr).reverse().toString();
			stra = new StringBuilder(stra).reverse().toString();

			String _strl, _strr, _stra;
			int _numl, _numr, _numa;
			boolean isSolved = false;
			for (int i = startNum; i < 10; i++) {
				_strl = strl.replace(MASK, Integer.toString(i));
				_strr = strr.replace(MASK, Integer.toString(i));
				_stra = stra.replace(MASK, Integer.toString(i));

				int carry = 0; // 桁上がり
				for (int j = 0; j < stra.length(); j++) {
					//
					try {
						_numl = Integer
								.parseInt(String.valueOf(_strl.charAt(j)));
					} catch (IndexOutOfBoundsException e) {
						_numl = 0;
					}
					try {
						_numr = Integer
								.parseInt(String.valueOf(_strr.charAt(j)));
					} catch (IndexOutOfBoundsException e) {
						_numr = 0;
					}
					try {
						_numa = Integer
								.parseInt(String.valueOf(_stra.charAt(j)));
					} catch (IndexOutOfBoundsException e) {
						_numa = 0;
					}
					if ((_numl + _numr + carry) % 10 == _numa) {
						if (j == stra.length() - 1) {
							isSolved = true;
							break;
						}
						carry = (_numl + _numr + carry) / 10;
					} else {
						isSolved = false;
						break;
					}
				}
				if (isSolved){
					System.out.println(i);
					break;
				}
			}
			if(!isSolved)
				System.out.println("NA");
		}
	}
}