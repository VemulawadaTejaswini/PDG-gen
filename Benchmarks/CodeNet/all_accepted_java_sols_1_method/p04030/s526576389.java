import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String m="";
		String taihi="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='B'){
				for(int j=0;j<m.length()-1;j++){
					taihi+=m.charAt(j);
				}
				m=taihi;
				taihi="";
			}else{
				m+=s.charAt(i);
			}
		}
		System.out.println(m);
	}

}