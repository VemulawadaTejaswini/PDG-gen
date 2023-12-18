import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		List<Integer> num = new ArrayList<Integer>();
		count = sc.nextInt();
		for(int i=0; i<count; i++) {
            num.add(sc.nextInt());
		}

		for(int i=count-1; i>=0; i--) {
			System.out.print(num.get(i));
			if(i!=0){
			    System.out.print(' ');
			}
		}
			System.out.println();
	}
}



