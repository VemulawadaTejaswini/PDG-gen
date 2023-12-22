import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[3];
		str[0] = sc.nextLine();
		str[1] = sc.nextLine();
		str[2] = sc.nextLine();
		boolean f = true;
		int i = 0;
		while(f) {
			if(str[i].substring(0,1).equals("a")){
				str[i] = str[i].substring(1,str[i].length());
				i = 0;
			}else if(str[i].substring(0,1).equals("b")){
				str[i] = str[i].substring(1,str[i].length());
				i = 1;
			}else if(str[i].substring(0,1).equals("c")){
				str[i] = str[i].substring(1,str[i].length());
				i = 2;
			}
			if(str[i].equals("")){
				if(i == 0) {
					System.out.println("A");
					return;
				}else if(i == 1) {
					System.out.println("B");
					return;
				}else if(i == 2) {
					System.out.println("C");
					return;
				}
			}
		}
	}
}