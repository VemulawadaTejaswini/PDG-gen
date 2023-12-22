import java.util.*;
class Main{
    public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int n=scan.nextInt();
	int h,m;
	h=n/3600;
	n%=3600;
	m=n/60;
	n%=60;
	System.out.println(h+":"+m+":"+n);
    }
}