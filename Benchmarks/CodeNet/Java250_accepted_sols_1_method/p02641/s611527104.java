import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int N = sc.nextInt();
      	int res = 0;

       if(N == 0){
         System.out.println(x); 
         return;
       }
      
      	//set
        Set<Integer> s = new HashSet<Integer>();     
        for (int i=0; i<N; i++) {
            int p = sc.nextInt();
          s.add(p);
        }        
      	//while x 0
      	int t = x;
      	int resA = 0;
      	while(t > 0){
          if(!s.contains(t)){
            resA = t;
            break;
          }
          t--;
        }
      
      	//while x 100
        int k = x;
        int resB = 101;
      	while(k <= 100){
          if(!s.contains(k)){
            resB = k;
            break;
          }
          k++;
        }

      	if(Math.abs(resA) == Math.abs(resB)){
		  if(resA > resB){
            res = resB;
          }else { res = resA;}
        }
      	else if(Math.abs(x - resA) > Math.abs(x - resB)){
          res = resB;
        }else{
          res = resA;
        }
        //System.out.println(resA+" "+resB);

        System.out.println(res);
    }
}