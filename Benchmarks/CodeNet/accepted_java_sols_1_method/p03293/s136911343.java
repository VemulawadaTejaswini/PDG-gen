import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      String line2 = sc.nextLine();
      int n=line.length();
      int n2=line2.length();
      if(n!=n2){
        System.out.println("No");
      }
      else{
        int count=0;
        boolean f=false;
      	while(count!=n){
      		if(line.equals(line2)){
            	f=true;
              	break;
            }
          String l=line.substring(0,1);
            line=line.substring(1,line.length());
          line+=l;
            count++;
      	}
        if(f){
        	System.out.println("Yes");
        }
        else System.out.println("No");
        
      }
 
    }
}