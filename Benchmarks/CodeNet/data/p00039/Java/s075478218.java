import java.util.Hashtable;
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String line;
		Hashtable<Character,Integer> hash = new Hashtable<Character,Integer>();
		hash.put('I',1);
		hash.put('V',5);
		hash.put('X',10);
		hash.put('L',50);
		hash.put('C',100);
		hash.put('D',500);
		hash.put('M',1000);
		
		while(scan.hasNext()){
			line = scan.next();
			int strLen = line.length();
			char[] roman = line.toCharArray();
			int sum=0;
			int prev = Integer.MAX_VALUE;
			
			for(int i=0;i<strLen;i++){
				if(prev >= hash.get(roman[i])){
					sum += hash.get(roman[i]);
				}else{
					sum = sum - prev*2 + hash.get(roman[i]);
				}
				prev = hash.get(roman[i]);
			}
			
			System.out.println(sum);
		}
	}
}