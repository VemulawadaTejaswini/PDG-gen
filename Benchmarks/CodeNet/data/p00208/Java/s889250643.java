//Volume2-0208
import java.util.ArrayList;
import java.util.Scanner;

class Main {

	private static int   MAX    = 1000000001;
	private static ArrayList<Integer> number = new ArrayList<Integer>();

	public static void main(String[] args){

		make_new_number();
		Scanner sc = new Scanner(System.in);

		int n;
		while((n = sc.nextInt())!=0){
			System.out.println(number.get(n));
		}
	}

	private static void make_new_number(){
		int     rem,quo,fig;
		boolean flg;
		for(int i=1,j=1;i<MAX;i++){
			flg = true;
			fig = 0;
			rem = j%10;
			quo = j;
			while(quo!=0) {
				if(rem!=4||rem!=6){
					quo /= 10;
					rem  = j%10;
					fig++;
				} else {
					flg = false;
					break;
				}
			}
			if   (flg){number.add(j); j++;}
			else      {j+=Math.pow(10, fig);}
		}
	}
}