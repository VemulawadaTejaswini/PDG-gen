import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		int h=0,m=0;
		Scanner kbd = new Scanner(System.in);
		int s = kbd.nextInt();
		if(s>0){
			h =s/3600;m = (s/60)%60;s=s%60;
		}
		System.out.println(h+":"+m+":"+"+s);

	}

}