import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] result = new int[4];//ac,wa,tle,re
      	for(int i = 0; i < n; i++){
        	String s = sc.next();
          	switch(s){
              case "AC":
                result[0]++;
				break;
              case "WA":
                result[1]++;
                break;
              case "TLE":
                result[2]++;
				break;
              case "RE":
                result[3]++;
                break;              
            }
        }
      	System.out.println("AC x " + result[0]);
      	System.out.println("WA x " + result[1]);
      	System.out.println("TLE x " + result[2]);
      	System.out.println("RE x " + result[3]);
    }
}