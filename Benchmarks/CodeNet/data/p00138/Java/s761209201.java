import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Runner[] a = new Runner[18];
		int cnt=0;
		for(int  j = 0;j<3;j++){
			Runner[] b = new Runner[8];
			for(int i = 0;i<8;i++){
				int num = cin.nextInt();
				double time= cin.nextDouble();
				b[i]=new Runner(num,time);
			}
			Arrays.sort(b);
			for(int i = 0;i<6;i++){
				a[cnt++]=b[i+2];
			}
			System.out.println(b[0].num + " " + b[0].timestr);
			System.out.println(b[1].num + " " + b[1].timestr);
		}
		Arrays.sort(a);
		System.out.println(a[0].num + " " + a[0].timestr);
		System.out.println(a[1].num + " " + a[1].timestr);
	}
}
class Runner implements Comparable{
	int num;
	double time;
	String timestr;
	Runner(int a,double b){
		num=a;
		time=b;
		timestr=String.valueOf(time);
		if(timestr.length()==4){
			timestr = timestr+"0";
		}
		
	}
	public int compareTo(Object o) {
		Runner r = (Runner)o;
		if(this.time-r.time > 0)
			return 1;
		else if(this.time-r.time == 0)
			return 0;
		else{
			return -1;
		}
	}
}