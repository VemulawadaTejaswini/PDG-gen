import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		while((temp = in.readLine()) != null) {
			int count=0;
			boolean coin = true;
			String[] hoge = temp.split(" ");
			char[] judge = hoge[0].toCharArray();
			while(true) {
				if((judge[0] + count) >= 't' && (judge[0] + count) == 't') {
					if((judge[1] + count) == 'h') {
						if((judge[2] + count) == 'e') {
							coin = false;
							break;
						}
						if((judge[2] + count) == 'a') {
							if((judge[3] + count) == 't') {
								coin = false;
								break;
							}
						}
						if((judge[2] + count) == 'i') {
							if((judge[3] + count) == 's') {
								coin = false;
								break;
							}
						}
					}
				}
				count++;
				if((judge[0] + count) > 'u' && coin) {
					count = 0;
					while(true) {
						if((judge[0] + count) >= 't' && (judge[0] + count) == 't') {
							if((judge[1] + count) == 'h') {
								if((judge[2] + count) == 'e') {
									coin = false;
									break;
								}
								if((judge[2] + count) == 'a') {
									if((judge[3] += count) == 't') {
										coin = false;
										break;
									}
								}
								if((judge[2] + count) == 'i') {
									if((judge[3] += count) == 's') {
										coin = false;
										break;
									}
								}
							}
						}
						count--;
					}
				}
				if(coin == false) break;
			}
			for(int i=0; i<hoge.length;i++) {
				boolean hogehoge = false;
				char[] last = hoge[i].toCharArray();
				for(int j=0; j<last.length; j++) {
					last[j] += count;
					if(last[last.length-1] == '*') {
						hogehoge = true;
						System.out.print('.');
						break;
					} else System.out.print(last[j]);
				}
				if(hogehoge == false) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}