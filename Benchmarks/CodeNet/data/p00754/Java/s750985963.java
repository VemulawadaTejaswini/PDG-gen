import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("a");
		StringBuilder sbsb = new StringBuilder("a");
		String str, substr;
		int flag_corner, flag_round;
		int index_corner, index_round;
		int lastindex_corner, lastindex_round;

		while(true){
			str = sc.nextLine();
			if(".".equals(str)) break;

			sb.replace(0, sb.length(), str);
			lastindex_corner = 0;
			lastindex_round = 0;
			flag_corner = 0;
			flag_round = 0;

			while(true){
				lastindex_corner = str.indexOf("]", lastindex_corner);
				if(lastindex_corner != -1){
					flag_corner++;
					sb.setCharAt(lastindex_corner, ' ');
					str = sb.toString();
				}else{
					lastindex_corner = str.length()-2;
				}

				index_corner = str.lastIndexOf("[", lastindex_corner);
				if(index_corner != -1){
					if(index_corner>lastindex_corner){
						System.out.println("no");
						break;
					}else{
						flag_corner--;
						sb.setCharAt(index_corner, ' ');
						str = sb.toString();
					}
				}
				if(flag_corner != 0){
					System.out.println("no");
					break;
				}
				System.out.println(str);

				
				if(index_corner == -1){
					substr = sb.toString();
				}else{
					substr = str.substring(index_corner+1, lastindex_corner);
				}
				sbsb.replace(0, sbsb.length(), substr);
				System.out.println(sbsb);

				while(true){
					lastindex_round = substr.indexOf(")", lastindex_round);
					if(lastindex_round != -1){
						flag_round++;
						sbsb.setCharAt(lastindex_round, ' ');
						substr = sbsb.toString();
					}else{
						lastindex_round = substr.length()-2;
					}

					index_round = substr.lastIndexOf("(", lastindex_round);
					if(index_round != -1){
						if(index_round>lastindex_round){
							System.out.println("no");
							flag_round = -2;
							break;
						}else{
							flag_round--;
							sbsb.setCharAt(index_round, ' ');
							substr = sbsb.toString();
						}
					}
					if(flag_round != 0){
						System.out.println("no");
						flag_round = -2;
						break;
					}
					System.out.println(substr);

					if(index_round==-1) break;
				}

				if(flag_round == -2) break;

				if(index_corner==-1){
					System.out.println("yes");
					break;
				}


				if(index_corner==lastindex_corner){
					sb = sbsb;
				}else{
					sb = sb.replace(index_corner+1, lastindex_corner, substr);
					System.out.println(sb);
				}
			}
		}

	}
}