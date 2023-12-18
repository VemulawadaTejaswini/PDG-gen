import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
      	String[] ss = new String[2*100000];
        int[] sss = new int[2*100000];
        String[] tt = new String[2*100000];
        int[] ttt = new int[2*100000];
      	Set<String> se = new HashSet<String>();
      	Set<String> se2 = new HashSet<String>();
      for(int i = 0; i< S.length() ; i++){
        se.add(S.substring(i,i+1));
      }
      for(int i = 0; i< T.length() ; i++){
        se2.add(T.substring(i,i+1));
      }
      int i = 0;
      for(String value : se){
	  	ss[i] = value;
        int count = 0;
        for(int j = 0; j < S.length(); j++){
        	if(Objects.equals(ss[i],S.substring(j,j+1)))
            {
            count++;
            }
        }
        sss[i] = count;
        ++i;
      }
      
      int ii = 0;
      for(String value : se2){
	  	tt[ii] = value;
        int count = 0;
        for(int j = 0; j < T.length(); j++){
        	if(Objects.equals(tt[ii],T.substring(j,j+1)))
            {
            count++;
            }
        }
        ttt[ii] = count;
        ++ii;
      }
      Arrays.sort(sss);
      Arrays.sort(ttt); 
      
      if(Arrays.equals(sss,ttt)){
      System.out.println("Yes");
      } else{
      System.out.println("No");
      }
    }
}