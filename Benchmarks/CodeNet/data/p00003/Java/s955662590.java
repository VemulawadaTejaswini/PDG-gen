import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader read = new BufferedReader(
                new java.io.InputStreamReader(System.in));
       int x = Integer.parseInt(read.readLine());
       String y=  read.readLine();
		// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
       int a=Integer.parseInt(y.substring(0, 1));
       int b=Integer.parseInt(y.substring(2, 3));
       int c=Integer.parseInt(y.substring(4, 5));
       a=a*a;
       b=a*b;
       c=c*c;
       if (a==b+c){
		System.out.println("YES");
       }else if (b==a+c){
   	   System.out.println("YES");
       }else if(c==a+b){
   	   System.out.println("YES");
       }else{
  	   System.out.println("NO");
       }
	}

}