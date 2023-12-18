  import java.util.Scanner;

        public class Main {
        	 public static void main(String args[]){
        	Scanner scanner = new Scanner(System.in);

        	String n=scanner.next();
        	int t=0;
               for(int i=0;i<3;i++){
            char str=n.charAt(i);
    		if(str=='R'){
                t=1;
            }}

        	for(int j=0;j<2;j++) {
          	char str1=n.charAt(j);
              char str2=n.charAt(j+1);

              if(str1==str2 && str1=='R'){
              t=t+1;
             }
        	}
        	System.out.println(t);
        	 }
        }