import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] str = line.split(" ");
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i=0;i<str.length;i++){
        	if(!str[i].equals("+")&&!str[i].equals("-")&&!str[i].equals("*")){
        		int tmp = Integer.parseInt(str[i]);
                array.add(tmp);
        	}else{
    			int n_1 = array.get(array.size()-1);
    			array.remove(array.size()-1);
    			int n_2 = array.get(array.size()-1);
    			array.remove(array.size()-1);
        		if(str[i].equals("+")){
        			array.add(n_1+n_2);
        		}else if(str[i].equals("-")){
        			array.add(n_2-n_1);
        		}else if(str[i].equals("*")){
        			array.add(n_1*n_2);
        		}
        	}
        }
    	System.out.println(array.get(array.size()-1));
	}
}