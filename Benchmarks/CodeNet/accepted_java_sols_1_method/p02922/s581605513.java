import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int ss = in.nextInt();
      	int na = in.nextInt();
      	int con = 0;
      	int cnt = 1;
      
      if(na==1){System.out.print(0);
               System.exit(0);
               }
      else if(ss>=na){
        			System.out.print(1);
                     System.exit(0);
                     }
      else{
        con += ss;
      	for(int i = 0;i < na; i++){
			con = (con-1)+ss;
          	cnt++;
          	if(con>=na){break;}
        }
      }
      System.out.print(cnt);
	}
}