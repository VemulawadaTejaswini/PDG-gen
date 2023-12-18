//Volume0-0085
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

	    //declare
		int        n,m,num,cnt,i;
		String  [] s;
		boolean [] list;

        //input
        Scanner sc = new Scanner(System.in);

        while(true){
        	s = sc.nextLine().split("\\s");
        	n = Integer.parseInt(s[0]);
        	m = Integer.parseInt(s[1]);
        	if((n|m) == 0){break;}

        	//calculate
        	list = new boolean[n];
        	num = n;
        	i   = n;
        	while(num-- > 0){
            	cnt = 0;
        		for(;cnt<m;i++){
        			if(!list[i=i%n]){cnt++;}
        		}
        		list[(i-1+n)%n] = true;
        	}

        	//output
        	System.out.println(i);
        }
	}
}