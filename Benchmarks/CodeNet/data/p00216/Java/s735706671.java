import java.util.Scanner;
public class Main{
	int w,km,a;
	int sm=4280;
	public void input(){
		Scanner sc = new Scanner(System.in);
		w =sc.nextInt();
		while(w!= -1){
			if(w<10){
				km=1150;
			}else if (w<20){
				a=w-10;
				km=1150+a*125;
			}else if (w<30){
				a=w-20;
			km=1150+1250+a*140;
			}else{
				a=w-30;
				km=1150+1250+1400+a*160;
			}
			System.out.println(sm-km);
			w =sc.nextInt();
		}
	}
	public static void main(String[] args){
		Main obj = new Main();
		obj.input();
	}
}