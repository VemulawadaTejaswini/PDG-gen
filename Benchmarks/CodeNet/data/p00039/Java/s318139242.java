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
			for(int i=0;i<strLen;i+=2){
				if(strLen-i == 1){
					sum += hash.get(roman[i]);
				}else{
					int first = hash.get(roman[i]);
					int second = hash.get(roman[i+1]);
					if(first < second){
						sum = sum + second - first;
					}else{
						sum = sum + first + second;
					}
				}
			}
			System.out.println(sum);
		}
	}
}