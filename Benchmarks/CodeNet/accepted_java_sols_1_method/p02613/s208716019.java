import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		Scanner sc=new Scanner(System.in);
      
		  int n=sc.nextInt();
      int c1=0,c2=0,c3=0,c4=0;
      
		 for(int i=1;i<=n;i++){
			String s=sc.next();
           if(s.contains("AC")){
				c1++;
		}else if(s.contains("WA")){
c2++;
}else if(s.contains("TLE")){
c3++;
           }else if(s.contains("RE")){
c4++;
           }
                    }
                    System.out.println("AC "+"x "+c1);
                     System.out.println("WA "+"x "+c2);
					 System.out.println("TLE "+"x "+c3);
                     System.out.println("RE "+"x "+c4);
                    }
                    }