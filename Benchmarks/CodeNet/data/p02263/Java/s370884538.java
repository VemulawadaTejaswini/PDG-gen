import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	private static ArrayList<Integer> queue = new ArrayList<Integer>();
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
        	String input[] = br.readLine().split("\\s+");
        	int a=0;
        	int b=0;

        	for(int i = 0; i < input.length; i++){
        		String l = input[i];
        		if(checkInt(l)){
        			//数字なのでデキューに追加
        			queue.add(Integer.valueOf(l));
        			continue;
        		}
        		a = queue.get(queue.size()-1);
        		queue.remove(queue.size()-1);
        		b = queue.get(queue.size()-1);
        		queue.remove(queue.size()-1);
        		//記号なのでキューを利用して演算
        		if(l.equals("+")){
        			queue.add(b+a);
        		} else if(l.equals("-")){
        			queue.add(b-a);
        		} else if(l.equals("*")){
        			queue.add(b*a);
        		} else if(l.equals("/")){
        			queue.add(b/a);
        		}
        	}
        	System.out.println(queue.get(0));
        } catch (NumberFormatException e) {
        	e.printStackTrace();
        } catch (IOException e) {
        	e.printStackTrace();
        }
    }
	public static boolean checkInt(String number){
		Pattern p = Pattern.compile("^[0-9]+$");
		Matcher m = p.matcher(number);
		return m.matches();
	}
}

