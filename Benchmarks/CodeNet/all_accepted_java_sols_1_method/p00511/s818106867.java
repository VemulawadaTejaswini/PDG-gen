import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int rst = sc.nextInt();
			int n = 0;
			String s = "";
			while(true){
				s = sc.next();
				if(s.compareTo("=")==0)break;
				n = sc.nextInt();
				if(s.compareTo("+")==0){
					rst += n; 
				}else if(s.compareTo("-")==0){
					rst -= n; 
				}else if(s.compareTo("*")==0){
					rst *= n; 
				}else if(s.compareTo("/")==0){
					rst /= n; 
				}
			}
			System.out.println(rst);
						
		}
	}
}