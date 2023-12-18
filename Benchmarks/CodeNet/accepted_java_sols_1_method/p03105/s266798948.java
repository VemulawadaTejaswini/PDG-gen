import java.util.*;

class Main{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

int N=sc.nextInt();
int B=sc.nextInt();
int C=sc.nextInt();
  if(C<=B/N){
	System.out.println(C);  
  }else{
  System.out.println(B/N);
  }
}
}