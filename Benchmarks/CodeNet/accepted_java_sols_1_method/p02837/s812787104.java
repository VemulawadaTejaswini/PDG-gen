import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
      	int human[] = new int[n];
      	int as[] = new int[n];
      	int al;
      	int acnt;
      	List wList = new ArrayList<Integer>();
      	boolean hs[] = new boolean[n];
      	boolean con;
      	int np = (int)Math.pow(2,n);
      	int count;
      	int count_max = 0;
      	int istack;
      	int istack2;
      
      	count = 0;
      	for(int i = 0;i < n;i++){
          as[i] = sc.nextInt();
          count += as[i];
          for(int j = 0;j < as[i];j++){
            istack = sc.nextInt()-1;
            if(sc.nextInt() == 1) wList.add(istack);
            else wList.add(istack + 100);
          }	
        }
      	al = count;
      
      	for(int i = 0;i < np;i++){
        	istack = i;
          	count = 0;
          	con = true;
          	for(int j = 0; j < n && istack > 0;j++){
          	  if(istack%2 == 1) {
                hs[j] = true;
                count++;
              }
          	  else hs[j] = false;
          	  istack /= 2;
            }
          	acnt = 0;
          	for(int j = 0;j < al && con;j++){
              if(hs[acnt]){
                for(int k = 0;k < as[acnt] && con;k++){
                  istack = (int)wList.get(j+k);
                  if(istack < 99){
                  	if(!hs[istack]) con = false; 
                  }
                  else{
                    if(hs[istack - 100]) con = false; 
                  }
                }
              }
              j += (as[acnt] - 1);
              acnt++;
            }
          	if(con){
              if(count_max < count) count_max = count;
            }
        }      	
      
      	System.out.println(count_max);
	}
}