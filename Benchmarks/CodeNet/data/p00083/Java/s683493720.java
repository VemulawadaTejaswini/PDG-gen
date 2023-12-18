import java.util.*;

public class AOJ0083{

     static long getHash(int y,int m,int o){
	return (long)(y*10000+m*100+o);
    }


    public static void main(String[] args){
	int Y,M,O;
	Scanner in = new Scanner(System.in);
	long premeiji = getHash(1868,9,7);
	long meiji_u = getHash(1868,9,8),meiji_b = getHash(1912,7,29);
	long taisho_u = getHash(1912,7,30),taisho_b = getHash(1926,12,24);
	long showa_u = getHash(1926,12,25),showa_b = getHash(1989,1,7);
	long heisei = getHash(1989,1,8);


	while(in.hasNext()){
	    Y = in.nextInt();
	    M = in.nextInt();
	    O = in.nextInt();
	    long input = getHash(Y,M,O);
	    if(input <= premeiji)System.out.println("pre-meiji");
	    else if(meiji_u <= input && input <= meiji_b)System.out.println("meiji " + (Y-1867) + " " + M + " " + O);
	    else if(taisho_u <= input && input <= taisho_b)System.out.println("taisho " + (Y-1911) + " " + M + " " + O);
	    else if(showa_u <= input && input <= showa_b)System.out.println("showa " + (Y-1925) + " " + M + " " + O);
	    else if(heisei <= input)System.out.println("heisei " + (Y-1988) + " " + M + " " + O);
	}

    }

}