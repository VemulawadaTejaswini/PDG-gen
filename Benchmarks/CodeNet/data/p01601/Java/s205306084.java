import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int i = 0;
			String s = "";
			StringBuffer sb = new StringBuffer();
			
			while(true){		
				if(n-i>0){
					s = Integer.toString(n-i);
					sb = new StringBuffer(s);
					if(sb.reverse().toString().compareTo(s)==0){
						System.out.println(s);
						break;
					}
				}
				s = Integer.toString(n+i);
				sb = new StringBuffer(s);
				if(sb.reverse().toString().compareTo(s)==0){
					System.out.println(s);
					break;
				}
				i++;
			}
			
		}
	}	
}