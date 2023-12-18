import java.util.Scanner;


public class Main {
	public static void main(String tok[])
	{
		int n,a,b,c,d,co;
		Scanner ui = new Scanner (System.in);
	    while(ui.hasNext()){
      n=ui.nextInt();
      co=0;
	        for(a=0;a<=9;a++){
	            for(b=0;b<=9;b++){
	                for(c=0;c<=9;c++){
	                    for(d=0;d<=9;d++){
	                        if(a+b+c+d==n)co++;
	                    }
	                }
	            }
	        }
	   System.out.println(co);
	    }
	    ui.close();
	    
	}
}