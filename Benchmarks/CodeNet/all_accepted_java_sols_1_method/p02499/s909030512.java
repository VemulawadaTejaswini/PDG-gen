import java.util.Scanner;
import java.util.HashMap;

class Main {
	public static void main(String args[]){
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		Scanner scan = new Scanner(System.in);
		for(int i=97;i<=122;i++){
			hm.put(i,0);
		}
		
		while(scan.hasNext()){	
			String str = scan.nextLine();
			
			for(int i=0;i<str.length();i++){
				if(65<=str.charAt(i) && str.charAt(i)<=90){
					hm.put(str.charAt(i)+32,hm.get(str.charAt(i)+32)+1);
				}else if(97<=str.charAt(i) && str.charAt(i)<=122){
					hm.put((int)str.charAt(i),hm.get((int)str.charAt(i))+1);
				}
			}
		}
		
		for(int i=97;i<=122;i++){
			System.out.println((char)i+" : "+hm.get(i));
		}
	}
}