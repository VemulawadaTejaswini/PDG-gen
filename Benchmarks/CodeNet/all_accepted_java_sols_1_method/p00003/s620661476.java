import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		try {
			Pattern pattern = Pattern.compile("([0-9]+) *([0-9]+) *([0-9]+)");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			Matcher matcher;
			ArrayList<Integer> l = new ArrayList<Integer>();
			int n=Integer.parseInt(bf.readLine());
			for(int i=0;i<n;i++){
				matcher = pattern.matcher(bf.readLine());
				if(matcher.matches()){
					for(int j=1;j<=3;j++){
						l.add(Integer.parseInt(matcher.group(j))*Integer.parseInt(matcher.group(j)));
					}
					Collections.sort(l);
					if(l.get(0).intValue()+l.get(1).intValue() == l.get(2).intValue()){
						System.out.println("YES");
					}else{
						System.out.println("NO");
					}
					l.clear();
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}