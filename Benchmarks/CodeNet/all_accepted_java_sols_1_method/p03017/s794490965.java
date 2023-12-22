import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String S = sc.next();
        boolean move = true;
        boolean oikoshi = true;
      for (int i=A-1;i<Math.max(C,D)-1;i++){
        String judge = S.substring(i,i+2);
        if (judge.equals("##")){
          move = false;
        }
      }
      if (C>D){
        oikoshi = false;
        for (int i=B-2;i<D-1;i++){
          String judge = S.substring(i,i+3);
          //System.out.println(judge);
          if (judge.equals("...")){
          oikoshi = true;
        }
      }
      }
      if (move&&oikoshi){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
       
    }
}