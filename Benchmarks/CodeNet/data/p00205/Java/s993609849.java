import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		int table[] = new int[5];
		int ans[] = new int[5];
		int work[] = new int[4];
		int count,zero_type;

		while((table[0] = scanner.nextInt()) != 0){

			for(int i = 1; i <= 3; i++){

				work[i] = 0;
			}

			work[table[0]] += 1;

			for(int i = 1; i < 5; i++){

				table[i] = scanner.nextInt();
				work[table[i]] += 1;
			}

			count = 0;
			zero_type = -1;

			for(int i = 1; i <= 3; i++){

				if(work[i] > 0){
					count++;
				}else{

					zero_type = i;
				}
			}

			if(count != 2){

				for(int i = 0; i < 5; i++){

					ans[i] = 3;
				}
			}else{

				int win = -1,lose = -1;

				switch(zero_type){
				case 1:
					win = 2;
					lose = 3;
					break;
				case 2:
					win = 3;
					lose = 1;
					break;
				case 3:
					win = 1;
					lose = 2;
					break;
				}

				for(int i = 0; i < 5; i++){

					if(table[i] == win){

						ans[i] = 1;
					}else{

						ans[i] = 2;
					}
				}
			}

			for(int i = 0; i < 5; i++){

				System.out.println(ans[i]);
			}

		}

    }
}

class UTIL{

	//最大公約数
	public static long gcd(long x,long y){

		x = Math.abs(x);
		y = Math.abs(y);

		if(x < y){

			long tmp = y;
			y = x;
			x = tmp;
		}

		if(y == 0){

			return x;
		}else{

			return gcd(y,x%y);
		}
	}

	//最小公倍数
	public static long lcm(long x,long y){

		return (x*y)/gcd(x,y);
	}

	//String→intへ変換
    public static int getNUM(String tmp_str){

        return Integer.parseInt(tmp_str);
    }

    //文字が半角数字か判定する関数
    public static boolean isNumber(String tmp_str){

        if(tmp_str == null || tmp_str.length() == 0){

            return false;
        }

        Pattern pattern = Pattern.compile("\\A[0-9]+\\z");
        Matcher matcher = pattern.matcher(tmp_str);
        return matcher.matches();
    }
}
