import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
		while(scan.hasNextLine()){
			int a = scan.nextInt();
			String op = scan.next();
			int b = scan.nextInt();
			//int a = Integer.parseInt(aa);
			//int b = Integer.parseInt(bb);
			int cal =0;
			
			if(op.charAt(0) == '?'){
				break;
			}
			else{
				if(op.charAt(0) == '+'){
					cal = a + b;
				}
				if(op.charAt(0) == '-'){
					cal = a - b;
				}
				if(op.charAt(0) == '*'){
					cal = a * b;
				}
				if(op.charAt(0) == '/'){
					cal = a / b;
				}
				list.add(cal);			
			}
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}