import java.util.Scanner;

class Structure{
	int n, x, i;
	public void execute(int k){
		n = k;
		i = 1;
		check_num();
		System.out.println("");
	}
	
	private void check_num(){
		//System.out.printf("x: %d, i: %d || check_num\n", x, i);
		x = i;
		if (x % 3 == 0){
		    System.out.printf(" %d", i);
		    end_check_num();
		    return;
		}
		include3();
	}
	
	private void include3(){
		//System.out.printf("x: %d, i: %d || include3\n", x, i);
		if (x % 10 == 3){
			System.out.printf(" %d", i);
			end_check_num();
			return;
		}
		x /= 10;
		if (x != 0) {include3(); return;}
		end_check_num();
	}
	
	private void end_check_num(){
		//System.out.printf("x: %d, i: %d || end_check_num\n", x, i);
		if (++i <= n) check_num();
	}
}

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Structure st = new Structure();
		st.execute(n);
	}
}