import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
      	long y = sc.nextLong();
      	long lstack,lstack2,lstack3;
      	int ilimit = (int)(y/10000);
      	int jlimit;
      	int num;
      	boolean con = true;
      
      	for(int i = 0;i <= ilimit && con; i++){
       	  lstack = y;	
          lstack -= 10000*i;
          jlimit = (int)lstack/5000;
          for(int j = 0;j <= jlimit && con;j++){
       	    num = j + (int)((lstack-5000*j)/1000);
            if((i+num) == n) {
              System.out.println(i + " " + j + " " + (num-j));
              con = false;
            }                         
          }
        }
	  	if(con) System.out.println("-1 -1 -1");
      
	}
}