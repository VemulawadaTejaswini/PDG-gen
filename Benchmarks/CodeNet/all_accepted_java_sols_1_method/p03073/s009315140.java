import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
        String s = sc.next();
        List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
        //0スタート
        int zero=0;
        for(int i=0;list.size()>i;i++) {
        	if(i%2==0) {
        		if(!list.get(i).equals("0"))
        			zero++;
        	}
        	else {
        		if(!list.get(i).equals("1"))
        			zero++;
        	}
        }
        //1スタート
        int one =0;
        for(int i=0;list.size()>i;i++) {
        	if(i%2==0) {
        		if(!list.get(i).equals("1"))
        			one++;
        	}
        	else {
        		if(!list.get(i).equals("0"))
        			one++;
        	}
        }
        if(zero<=one)
        	System.out.println(zero);
        else
        	System.out.println(one);
	}
}