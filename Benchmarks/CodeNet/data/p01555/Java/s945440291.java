import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
 
public class Main{
	
	public static long count(long s){
		long p = 1;
		long cnt = 1;
		long res = 0;
		
		while(p * 10 < s){
			long less3 =  (p * 10 - 1)/3 - (p - 1)/3;
			long less5 =  (p * 10 - 1)/5 - (p - 1)/5;
			long less15 = (p * 10 - 1)/15 - (p - 1)/15;
			
			res += ((p * 10 - 1) - (p - 1) - less3 - less5 + less15) * cnt;
			res += (less3 - less15) * 4;
			res += (less5 - less15) * 4;
			res += less15 * 8;
			
			cnt++;
			p *= 10;
		}
		
		
		long less3 =  (s - 1)/3 - (p - 1)/3;
		long less5 =  (s - 1)/5 - (p - 1)/5;
		long less15 = (s - 1)/15 - (p - 1)/15;
		
		res += ((s - 1) - (p - 1) - less3 - less5 + less15) * cnt;
		res += (less3 - less15) * 4;
		res += (less5 - less15) * 4;
		res += less15 * 8;
		
		return res;
	}
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	final long s = sc.nextLong();
    	
    	long upper = s;
		long lower = 1/*(long) Math.pow(10 ,(long)Math.log10(s))*/;
		
		while(upper - lower > 1){
			long med = (upper + lower)/2;
			long dist = count(med);
			//System.out.println(upper + " " + lower + " " + med + " " + dist + " " + s);
			
			if(dist > s){
				upper = med;
			}else if(dist < s){
				lower = med;
			}
		}
		
		long less = s - count(lower);
		StringBuilder b = new StringBuilder();
		
		for(long i = lower; b.length() < less + 20; i++){
			
			if(i % 15 == 0){
				b.append("FizzBuzz");
			}else if(i % 5 == 0){
				b.append("Buzz");
			}else if(i % 3 == 0){
				b.append("Fizz");
			}else{
				b.append(Long.toString(i));
			}
		}
		
		System.out.println(b.substring((int)(less)-1, (int)(less)+19));
    	
    }
     
}