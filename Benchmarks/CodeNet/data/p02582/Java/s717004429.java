import java.util.Scanner;

    public class Main {
    	 public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);

    	String n=scanner.nextString();
    	int t=0;
           for(i=0;i<3;i++){
        String str=n.charAt(0);
		if(str1=="R"){
            t=1;
        }}

    	for(int j=0;j<2;j++) {
      	String str1=n.charAt(j);
          String str2=n.charAt(j+1);
          
          if(str1==str2 && str1=="R"){
          t=t+1
         }
    	}
    	System.out.println(t);
    	 }
    }