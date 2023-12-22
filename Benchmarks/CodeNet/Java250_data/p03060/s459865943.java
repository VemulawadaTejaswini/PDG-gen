import java.util.*;
class Main{
  	public static void main(String arts[]){
      	Scanner sc =  new Scanner(System.in);
      	int X = 0;
      	int Y = 0;
      	int Rls = 0;
      	int N = sc.nextInt();
      	sc.nextLine();
      	String Vlist = sc.nextLine();
      	String[] Vs = Vlist.split(" ");
      	int[] V = new int[Vs.length];
        for(int n = 0;n < V.length;n++){
          	V[n] = Integer.parseInt(Vs[n]); 
        }
      	String Clist = sc.nextLine();
      	String[] Cs = Clist.split(" ");
      	int[] C = new int[Cs.length];
      	for(int n = 0;n < C.length;n++){
          	C[n] = Integer.parseInt(Cs[n]);
        }
      	int[] D = new int[C.length];
      	for(int x = 0;x < D.length;x++){
          	D[x] = V[x] - C[x];
        }
      	Arrays.sort(D);
      	for(int n = C.length-1;n>=0;n--){
          if(D[n]<=0){
            	break;
          }
          Rls = Rls + D[n];
        }
      	System.out.println(Rls);
    }
}
              	