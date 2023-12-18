import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		while(true){
			int h = sc.nextInt(),
				d = sc.nextInt(),
				s = sc.nextInt();
			if( h == -1 & d == -1 & s == -1)break;
			int sum = 2*3600 - (h*3600 + d*60 + s);
			int ansh = sum /3600,
				ansd = sum%3600/60,
				anss = sum - ansh*3600 - ansd*60;
			if(ansd < 10 && anss < 10){
				System.out.println(":"+ansh+":0"+ansd+":0"+anss );
			}else if(ansd < 10){
				System.out.println(":"+ansh+":0"+ansd+":"+anss );
			}else if(anss < 10){
				System.out.println(":"+ansh+":"+ansd+":0"+anss );
			}
			
			sum = 2*3600 - (h*1200 + d*20 + s);
			ansh = sum /3600;
			ansd = sum%3600/60;
			anss = sum - ansh*3600 - ansd*60;
				System.out.println("0"+ansh+":"+ansd+":"+anss );
			
		}
	}

}