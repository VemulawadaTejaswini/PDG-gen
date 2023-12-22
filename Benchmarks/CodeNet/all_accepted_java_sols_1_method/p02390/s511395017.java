import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int x = scan.nextInt();
    	int h,m,s;
    	h = x / (60*60);
    	m = (x-h*60*60)/60;
    	s = x-h*60*60-m*60;
        System.out.println(h+":"+m+":"+s);
    }
}