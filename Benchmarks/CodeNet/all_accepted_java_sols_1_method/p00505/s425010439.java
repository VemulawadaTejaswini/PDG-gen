//Volume5-0582
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int a,b,c,x=0,y=0,h=0,triangle=0,right=0,acute=0,obtuse=0;

		while(true){
			a=sc.nextInt(); b=sc.nextInt(); c=sc.nextInt();
			if(a >= b+c || b >= a+c || c >= a+b){break;}
			triangle++;
			if     (a >= b && a >= c){h=a;x=b;y=c;}
			else if(b >= c && b >= a){h=b;x=c;y=a;}
			else if(c >= a && c >= b){h=c;x=a;y=b;}
			if(Math.pow(h,2) == Math.pow(x, 2)+Math.pow(y, 2)){
				right++;
			} else if (Math.pow(h,2) < Math.pow(x, 2)+Math.pow(y, 2)){
				acute++;
			} else {
				obtuse++;
			}
		}
		System.out.println(triangle+" "+right+" "+acute+" "+obtuse);
	}
}