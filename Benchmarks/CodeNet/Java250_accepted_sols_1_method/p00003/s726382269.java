import java.io.BufferedReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader read = new BufferedReader(
                new java.io.InputStreamReader(System.in));

       int x = Integer.parseInt(read.readLine());

       for(int i=0;i<x;i++){
       String y=  read.readLine();
       String z [] =y.split(" ");
       //System.out.println(z[2]);
       //System.out.println(x);
	// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
       int a=Integer.parseInt(z[0]);
       int b=Integer.parseInt(z[1]);
       int c=Integer.parseInt(z[2]);
       a=a*a;
       b=b*b;
       c=c*c;
       if (a==(b+c)){
		System.out.println("YES");
       }else if (b==(a+c)){
   	   System.out.println("YES");
       }else if(c==(a+b)){
   	   System.out.println("YES");
       }else{
  	   System.out.println("NO");
       }
      }
	}

}