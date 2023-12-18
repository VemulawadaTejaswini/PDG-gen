import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


class Main {
	static int n,m,a;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] ss = in.readLine().split(" ");
			n = Integer.parseInt(ss[0]);
			m = Integer.parseInt(ss[1]);
			a = Integer.parseInt(ss[2]);
			if(n == 0){
				break;
			}
			ArrayList<String> yoko = new ArrayList<String>();
			for(int i = 0; i < m ;i++){
				yoko.add(in.readLine());
			}
			Collections.sort(yoko, new YokoComparator());
			for(String s : yoko){
				String[] sss = s.split(" ");
				if(a == Integer.parseInt(sss[1])){
					a = Integer.parseInt(sss[2]);
				}
				else if(a == Integer.parseInt(sss[2])){
					a = Integer.parseInt(sss[1]);
				}
			}
			System.out.println(a);
		}	

	}

}
class YokoComparator implements Comparator<String> { 
	@Override 
	public int compare(String s1, String s2) {
		return Integer.parseInt(s1.split(" ")[0]) < Integer.parseInt(s2.split(" ")[0]) ? 1 : -1; 
	} 
} 