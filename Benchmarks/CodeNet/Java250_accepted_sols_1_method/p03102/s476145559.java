import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int sous = sc.nextInt();
      	int kazu = sc.nextInt();
       	int C = sc.nextInt();
        int flag = 0;
        int sam = 0;
      int b[] = new int[kazu];
      
      for(int i=0;i<kazu;i++){b[i] = sc.nextInt();}
      for(int j=0;j<sous;j++){
        sam = 0;
        for(int k=0;k<kazu;k++){
          sam += sc.nextInt()*b[k];
        } if(sam+C>0){flag++;}
      }
      
       System.out.print(flag);
    }
}