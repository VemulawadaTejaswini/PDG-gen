import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		BigDecimal ans = BigDecimal.ZERO;
		Map<String, Integer> list = new HashMap<>();
		for(int i = 0; i < num; i++){
			String str = sc.next();
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			str = new String(chars);
			try{
				ans = ans.add(BigDecimal.valueOf(list.get(str)));
				list.put(str, list.get(str)+1);
			}catch(Exception e){
				list.put(str, 1);
			}
		}

		System.out.println(new DecimalFormat("0").format(ans));

	}
}