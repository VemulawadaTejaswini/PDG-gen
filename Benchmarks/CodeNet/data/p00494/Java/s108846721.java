import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s = sc.next();
			int len = s.length();
			
			StringBuffer t;
			boolean flag = true;
			for(int i=len/3;i>0;i--){
				t = new StringBuffer();
				for(int j=0;j<i;j++){
					t.append("J");
				}
				for(int j=0;j<i;j++){
					t.append("O");
				}
				for(int j=0;j<i;j++){
					t.append("I");
				}
				if(s.indexOf(t.toString())!=-1){
					System.out.println(i);
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("0");
			}
		}
	}
}