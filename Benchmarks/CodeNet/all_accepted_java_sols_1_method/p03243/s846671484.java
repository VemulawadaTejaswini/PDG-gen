import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
          
      for(int i=111;i<=999;i=i+111){
        if(i>=N){System.out.print(i);break;}
      }

	}
}