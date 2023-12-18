import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int nam[] = new int[4]; int w = 1000;
        int flag = 0;
      
      for(int i = 0; i<4 ;i++){
        nam[i] = S/w;S%=w;w /= 10;
      }
      for(int i = 1;i<4;i++){
       if(nam[i]==nam[i-1]){flag=1;} 
      }
	  if(flag==1){System.out.print("Bad");}
      else{System.out.print("Good");}
      
    }
}