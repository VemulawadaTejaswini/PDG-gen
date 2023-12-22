import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		doIt();

	}
	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long a = sc.nextLong();
			long b = sc.nextLong();
			System.out.println(getLCM(a, b) + " " + getGCD(a, b));
		}
//		System.out.println(getGCD(8, 6));;
//		System.out.println(getGCD(50000000, 30000000));;
//		System.out.println(getGCD(3, 1));;
	}
	
	//a >= b
	public static long getGCD(long a, long b){
		long ta = a, tb = b;
		while(true){
			if(ta == tb){
				break;
			}
			while(ta > tb){
				tb += b;
			}
			while(tb > ta){
				ta += a;
			}
			//System.out.println("ta = " + ta + ", tb = " + tb);
			
		}
		
		return ta;
	}
	
	//a >= b
	public static long getLCM(long a, long b){
		long p, q, r;
		p = a;
		q = b;
		r = b;
		long tmp;
		do{
			tmp = r;
			r = p % q;
			p = q;
			q = r;
			
		}while(r != 0);
		
		return tmp;
	}

}