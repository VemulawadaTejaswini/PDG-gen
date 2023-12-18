import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.nextLine();
			ArrayDeque<Double> list = new ArrayDeque<Double>();
			
			int i=0;
			int start = 0;
			double p = 0;
			double q = 0;
			String t = "";
			while(true){
				start = i;
				while(s.codePointAt(i)!=32){
					i++;
					if(i==s.length())break;
				}
				t = s.substring(start, i);
				i++;
				if(t.compareTo("+")==0){
					p = list.pop();
					q = list.pop();
					list.push(q+p);
				}else if(t.compareTo("-")==0){
					p = list.pop();
					q = list.pop();
					list.push(q-p);
				}else if(t.compareTo("*")==0){
					p = list.pop();
					q = list.pop();
					list.push(q*p);
				}else if(t.compareTo("/")==0){
					p = list.pop();
					q = list.pop();
					list.push(q/p);
				}else{
					list.push(Double.valueOf(t));
				}
				
				if(i>=s.length())break;
			}
			
			System.out.println(list.pop());
		}
	}	
}