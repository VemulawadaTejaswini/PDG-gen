import java.util.*;

public class Main {
 
    private static ArrayList<ArrayList<Character>> X = new ArrayList<ArrayList<Character>>(),
                                                   Y = new ArrayList<ArrayList<Character>>();

    public static void main(String[] args) {
 
        //input
         Scanner sc = new Scanner(System.in);
         int      N = sc.nextInt();
 
         char[] c_ar;
         ArrayList<Character> a;
		 for(int i = 0;i < N;i++){
        	 for(int j=0;j<2;j++){
        		 c_ar = sc.next().toCharArray();
        		 a = new ArrayList<Character>(); 
        		 for(char c:c_ar){a.add(c);}
        		 if   (j==0){X.add(a);}
       			 else       {Y.add(a);}
        	 }
         }

         //calculation
		 int[] result = new int[N];
		 for(int i=0;i<N;i++){
			 result[i] = LCS_length(X.get(i),Y.get(i));
		 }

         //output
         for (int i:result) {System.out.println(i);}
    }

    private static int LCS_length(ArrayList<Character> X,ArrayList<Character> Y){
    	int     m = X.size(),
    	        n = Y.size(),
    	        i,j;
    	int[][] c = new int[m+1][n+1];
    	
    	for(i=0;i<m+1;i++){c[i][0]=0;}
    	for(i=1;i<n+1;i++){c[0][i]=0;}
    	for(i=1;i<m+1;i++){
    		for(j=1;j<n+1;j++){
    			if   (X.get(i-1) == Y.get(j-1)){c[i][j] = c[i-1][j-1]+1;}
    			else {
    				if   (c[i-1][j] > c[i][j-1]){c[i][j] = c[i-1][j];}
    				else                        {c[i][j] = c[i][j-1];}
    			}
    		}
    	}
    	return c[m][n];
   }
}