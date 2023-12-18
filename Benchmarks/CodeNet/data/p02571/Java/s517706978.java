import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
      	String t = sc.next();
      	int slen = s.length();
      	int tlen = t.length();
      	int min = 10000;
      	for(int i=0;i<slen-tlen+1;i++){
          int count = 0;
          for(int j=0;j<tlen;j++){
            if( s.charAt(i+j) == t.charAt(j) ){
              count++;
            }
          }
          if( tlen - count < min ){
            min = tlen - count;
          }
        }
      System.out.println(min);
	}
}