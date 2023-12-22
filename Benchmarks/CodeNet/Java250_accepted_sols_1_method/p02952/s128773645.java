import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_gold=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		int n = sc.nextInt();
		int v = String.valueOf( n ).length();
		if(v==1) {
			System.out.println(n%10);
		}
		else if(v==2) {
			System.out.println("9");
		}
		else if(v==3) {
			System.out.println(9+(n/100-1)*100+n%100+1);
		}
		else if(v==4) {
			System.out.println("909");
		}
		else if(v==5) {
			System.out.println(909+(n/10000-1)*10000+n%10000+1);
		}
		else {
			System.out.println("90909");
		}
	}

}