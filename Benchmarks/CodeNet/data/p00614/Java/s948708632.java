import java.util.Scanner;

/**
 * Ideal Coin Payment and Change
 *  URL:http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=1028&lang=jp
 *
 * @author Igari Kazuya
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ©®¶¬³ê½\bhEX^u
		Scanner sc = new Scanner(System.in);
		int[] money;
		int p;
		int count;
		while(true){
			money = new int[6];
			p = sc.nextInt();
			count = 0;

			for(int i=0;i<6;i++){
				money[i] = sc.nextInt();
			}

			if(p == 0){
				break;
			}

			//500~ÈºÜÅÅø¦Åx¥àzð¸çµÄ¢­
			while(p>=500){
				if(money[5] != 0){
					p -= 500;
					money[5]--;
					count++;
				}else if(money[4] != 0){
					p -= 100;
					money[4]--;
					count++;
				}else if(money[3] != 0){
					p -= 50;
					money[3]--;
					count++;
				}else if(money[2] != 0){
					p -= 10;
					money[2]--;
					count++;
				}else if(money[1] != 0){
					p -= 5;
					money[1]--;
					count++;
				}else{
					p -= 1;
					money[0]--;
					count++;
				}
			}

			int[] countarray = new int[6];
			for(int i=0;i<countarray.length;i++){
				countarray[i]=0;
			}
			int buf;

			//500~x¥
			if(money[5] != 0){
				countarray[0]++;
				buf = 500 - p;

				//¨ÂèvZ
				//100~Ê
				countarray[0] += buf / 100;
				buf %= 100;
				//50~Ê é©Ç¤©
				if(buf%10 > 5){
					countarray[0]++;
				}
				countarray[0] += (buf/10)%5;
				buf %= 10;
				//5~Ê é©Ç¤©
				if(buf > 5){
					countarray[0]++;
				}
				countarray[0] += buf%5;
			}else{
				countarray[0] = -1;
			}

			//5nn~x¥
			if(money[5] != 0){
				countarray[1]++;
				buf = p % 100;
				if(buf/10 > 5){
					buf -= 50;
				}
				if(buf%10 > 5){
					buf -= 5;
				}

				int m = MoneyCheck(buf,money);
				if(m==0){
					countarray[1] = -1;
				}else{
					countarray[1] += m;


					buf = buf + 500 - p;

					//¨ÂèvZ
					//100~Ê
					countarray[1] += buf / 100;
					buf %= 100;
					//50~Ê é©Ç¤©
					if(buf/10 > 5){
						countarray[1]++;
					}
					countarray[1] += (buf/10)%5;
					buf %= 10;
					//5~Ê é©Ç¤©
					if(buf/10 > 5){
						countarray[1]++;
					}
					countarray[1] += (buf/10)%5;
				}
			}else{
				countarray[1] = -1;
			}

			//n00~x¥
			buf = (p / 100) + 1;
			if(buf == 5 || money[4] < buf){
				countarray[2] = -1;
			}else{
				countarray[2] += buf;
				money[4] -= buf;
				buf = (buf*100) - p;

				//¨ÂèvZ 100~ÊÌ¨ÂèÍ è¾È¢ÌÅÈª
				//50~Ê é©Ç¤©
				if(buf/10 > 5){
					countarray[2]++;
				}
				countarray[2] += (buf/10)%5;
				buf %= 10;
				//5~Ê é©Ç¤©
				if(buf/10 > 5){
					countarray[2]++;
				}
				countarray[2] += (buf/10)%5;
			}

			//nnn~x¥
			int a,b,c;
			a = p / 100;
			b = (p/10) % 10;
			c = p % 10;
			if(b >= 5){
				b -= 5;
				a++;
				if(c >= 5){
					c -=5;
				}
			}else if(c >= 5){
				c -= 5;
				a++;
			}

			buf = a * 100 + b * 10 + c * 1;

			int m = MoneyCheck(buf,money);
			if(m==0){
				countarray[3] = -1;
			}else{
				countarray[3] += m;

				buf = buf - p;

				//¨ÂèvZ 100~ÊÌ¨ÂèÍ è¾È¢ÌÅÈª
				//50~Ê é©Ç¤©
				if(buf/10 > 5){
					countarray[3]++;
				}
				countarray[3] += (buf/10)%5;
				buf %= 10;
				//5~Ê é©Ç¤©
				if(buf/10 > 5){
					countarray[3]++;
				}
				countarray[3] += (buf/10)%5;
			}

			//ÒÁ½è
			buf = p;
			m = MoneyCheck(buf,money);
			if(m==0){
				countarray[4] = -1;
			}else{
				countarray[4] += m;

				buf = buf - p;

				//¨ÂèvZ 100~ÊÌ¨ÂèÍ è¾È¢ÌÅÈª
				//50~Ê é©Ç¤©
				if(buf/10 > 5){
					countarray[4]++;
				}
				countarray[4] += (buf/10)%5;
				buf %= 10;
				//5~Ê é©Ç¤©
				if(buf/10 > 5){
					countarray[4]++;
				}
				countarray[4] += (buf/10)%5;
			}

			//¿àÅ¥¦é©
			buf = p;
			m = MoneyCheck2(buf,money);
			if(m==0){
				countarray[5] = -1;
			}else{
				countarray[5] += m;

				buf = buf - p;

				//¨ÂèvZ 100~ÊÌ¨ÂèÍ è¾È¢ÌÅÈª
				//50~Ê é©Ç¤©
				if(buf/10 > 5){
					countarray[5]++;
				}
				countarray[4] += (buf/10)%5;
				buf %= 10;
				//5~Ê é©Ç¤©
				if(buf/10 > 5){
					countarray[5]++;
				}
				countarray[5] += (buf/10)%5;
			}

			int mincount = 99999;
			if(countarray[0] != -1){
				mincount = countarray[0];
			}
			for(int i=1;i<countarray.length;i++){
				if(countarray[i] != -1 && countarray[i] < mincount){
					mincount = countarray[i];
				}
			}

			System.out.println(count+mincount);
		}
	}

	/**
	 * ©ªÌÁÄéRCÅÒÁ½èx¥¦é©Ç¤©²×é
	 *
	 * @param p ¥¤àz
	 * @param money RCzñ
	 * @return KvÅZ 0ÌÍx¥¦È¢
	 */
	static int MoneyCheck(int p, int[] money){
		int count = 0;
		int[] bufmoney = new int[6];
		for(int i=0;i<money.length;i++){
			bufmoney[i] = money[i];
		}
		while(p != 0){
			if(bufmoney[5] != 0 && p > 500){
				p -= 500;
				bufmoney[5]--;
				count++;
			}else if(bufmoney[4] != 0 && p > 100){
				p -= 100;
				bufmoney[4]--;
				count++;
			}else if(bufmoney[3] != 0 && p > 50){
				p -= 50;
				bufmoney[3]--;
				count++;
			}else if(bufmoney[2] != 0 && p > 10){
				p -= 10;
				bufmoney[2]--;
				count++;
			}else if(bufmoney[1] != 0 && p > 5){
				p -= 5;
				bufmoney[1]--;
				count++;
			}else if(bufmoney[0] != 0 && p >= 1){
				p -= 1;
				bufmoney[0]--;
				count++;
			}else{
				return 0;
			}
		}
		return count;
	}

	/**
	 * ©ªÌÁÄéRCÅx¥¦é©Ç¤©²×é
	 *
	 * @param p ¥¤àz
	 * @param money RCzñ
	 * @return KvÅZ 0ÌÍx¥¦È¢
	 */
	static int MoneyCheck2(int p, int[] money){
		int count = 0;
		int[] bufmoney = new int[6];
		for(int i=0;i<money.length;i++){
			bufmoney[i] = money[i];
		}
		while(p > 0){
			if(bufmoney[5] != 0){
				p -= 500;
				bufmoney[5]--;
				count++;
			}else if(bufmoney[4] != 0){
				p -= 100;
				bufmoney[4]--;
				count++;
			}else if(bufmoney[3] != 0){
				p -= 50;
				bufmoney[3]--;
				count++;
			}else if(bufmoney[2] != 0){
				p -= 10;
				bufmoney[2]--;
				count++;
			}else if(bufmoney[1] != 0){
				p -= 5;
				bufmoney[1]--;
				count++;
			}else if(bufmoney[0] != 0){
				p -= 1;
				bufmoney[0]--;
				count++;
			}else{
				return 0;
			}
		}
		return count;
	}

}