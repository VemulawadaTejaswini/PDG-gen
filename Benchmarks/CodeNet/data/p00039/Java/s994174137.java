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
			if(strLen == 1){
				sum = hash.get(roman[0]);
			}else if(strLen == 2){
				int first = hash.get(roman[0]);
				int second = hash.get(roman[1]);
				if(first < second){
					sum = second - first;
				}else{
					sum = first + second;
				}
			}else{
				int i=0;
				while(i < strLen-1){
					int first = hash.get(roman[i]);
					int second = hash.get(roman[i+1]);
					int third=0;
					if(i == strLen-2){
						if(first<second){
							sum = sum + (second-first);
							break;
						}else{
							sum = sum + first + second;
							break;
						}
					}else if(i == strLen-3){
						third = hash.get(roman[i+2]);
						if(first < second){
							sum = sum + (second-first) + third;
							break;
						}else if(second < third){
							sum = sum + first + (third - second);
							break;
						}else{
							sum = sum + first + second + third;
							break;
						}
					}else{
						if(first < second){
							sum += (second-first);
							i+=2;
						}else if(second < third){
							sum += first;
							i++;
						}else{
							sum = sum + first + second;
							i+=2;
						}
					}
				}
			}
			System.out.println(sum);
		}
	}
}