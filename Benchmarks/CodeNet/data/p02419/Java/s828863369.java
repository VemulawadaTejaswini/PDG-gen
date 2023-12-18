import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String[] args) {
		//宣言
		String[] str= new String[1000];
		sc = new Scanner(System.in);
		int i=0;
		int j=0;
		int count=0;
		//入力
		String search=sc.next();
		for(;;) {
			str[i]=sc.next();
			if(str[i].equals("END_OF_TEXT")) {
				break;
			}
			//System.out.println(i+str[i]);
			i++;
			j++;
		}
		//出力
		for(i=0;i<j;i++) {
			if(str[i].equalsIgnoreCase(search)) {
				count++;
			}
		}
		System.out.println(count);
	}
}

