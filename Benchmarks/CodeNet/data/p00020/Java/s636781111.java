import java.util.*;	
public class Main {
	public static void main(String[] args) {
					Scanner in =new Scanner(System.in);
					String str = in.nextLine();
					str=str.toUpperCase(); //只对英文字母有效 对其他字符无效
					System.out.println(str);
					in.close();
			}
	}
