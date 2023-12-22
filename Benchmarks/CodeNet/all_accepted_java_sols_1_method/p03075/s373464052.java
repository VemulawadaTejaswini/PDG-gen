import java.util.*;

class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
      
        int kyori [] = new int[5];
        for(int i = 0;i<5;i++){
          kyori[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max = kyori[4] - kyori[0];
  if(max<=k){System.out.println("Yay!");}
  else{System.out.println(":(");}
      

    }
}