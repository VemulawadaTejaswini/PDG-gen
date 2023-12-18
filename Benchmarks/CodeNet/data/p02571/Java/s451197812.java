import java.util.*;
class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
    	String T = sc.next();
    	int Tl = T.length();
			
        String[] Tt = new String[Tl];
        int x = 0;

      	for (int i = 0; i  < Tl; i++){
          Tt[i] = T.substring(0,i+1);
					

				if (!S.contains(Tt[0])){
					x = Tl; break;
				}
    		else if(!S.contains(Tt[i])){
              if(lastIndexOf(Tt[i] < Tl){
                x = Tl; break;
              }

        		x = Tl - i ;
             break;
        	}
					else{
						x = 0;
					}


         }
      System.out.println(x);
    }
 }
