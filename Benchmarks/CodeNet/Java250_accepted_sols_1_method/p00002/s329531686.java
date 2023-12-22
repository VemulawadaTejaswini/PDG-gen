import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int fa = 0;
    	int fb = 0;
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){
    	fa = scan.nextInt();
    	fb = scan.nextInt();
    	int sum = fa + fb;
    	 System.out.println((int) Math.log10(sum) + 1);
    	}
    }
 }