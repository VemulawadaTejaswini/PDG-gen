//Volume1-0127
import java.util.Scanner;

class Main {

    //declare
	private static final char[][] table = {{'a','f','k','p','u','z'},
		                                   {'b','g','l','q','v','.'},
		                                   {'c','h','m','r','w','?'},
		                                   {'d','i','n','s','x','!'},
		                                   {'e','j','o','t','y',' '}};

    public static void main(String[] arg){

    	int    x,y;
    	String ret;
    	char[] num;

        //input
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	ret = "";
        	num = sc.nextLine().toCharArray();
        	out: {
        		if(num.length%2!=0){ret = "NA"; break out;}
        		for(int i=0;i<num.length;i+=2){
        			if(!(Character.isDigit(num[i]) && Character.isDigit(num[i+1]))){
        				ret = "NA"; break out;
        			}
        			x = Character.digit(num[i],10)-1;
        			y = Character.digit(num[i+1],10)-1;
        			if(x < 0 || 5 < x || y < 0 || 4 < y){
        				ret = "NA"; break out;
        			}
        			ret += String.valueOf(table[y][x]);
        			}
        		}
        	System.out.println(ret);
        }
    }
}