import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int ihas = 0;
		int iline = Integer.parseInt(line);
		for(int i=0;i<line.length();i++) {
			int x = line.charAt(i) - 48;
			ihas += x;
		}
		if(iline%ihas==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
    }
}