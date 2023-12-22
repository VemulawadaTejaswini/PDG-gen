import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
        int[] ac = new int[n+1];
        int count=0;
        for(int i=0;n-1>i;i++) {
        	if(list.get(i).equals("A")) {
        		if(list.get(i+1).equals("C"))
        			count++;
        	}
        	ac[i+1] = count;
        }
        //System.out.println(ac);
        //List<Integer> answer = new ArrayList<Integer>();
        for(int i=0;q>i;i++) {
        	int a = sc.nextInt()-1;
        	int b = sc.nextInt()-1;
        	System.out.println(ac[b]-ac[a]);
        }
        //System.out.println(answer);

	}
}