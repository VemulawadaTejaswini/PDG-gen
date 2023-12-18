import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
      //  ArrayList <Double> mou =new ArrayList <Double>();
        while (true){
        	int a=scan.nextInt();
        	int b=scan.nextInt();
        	if((a|b)==0)break;
        	boolean flag =true;
        	for(int i=a;i<=b;i++){
        		if(i%400==0||i%4==0&&i%100!=0){
        			System.out.println(i);
        			flag=false;
        		}
        		}
        	if(flag)System.out.println("NA");
        	System.out.println();
System.out.println();
        	}
     
        }
      


}