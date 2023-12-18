import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long A=sc.nextLong();
      long V=sc.nextLong();
      long B=sc.nextLong();
      long W=sc.nextLong();
      long T=sc.nextLong();
      if(A<B){
      long pursuer = A+V*T;
      long runner = B+W*T;
      	if(pursuer>=runner){
        	System.out.print("YES");
      	}else{
        	System.out.print("NO");
      	}
      }else{
      	long pursuer = A-V*T;
      	long runner = B-W*T;
      	if(pursuer<=runner){
        	System.out.print("YES");
      	}else{
        	System.out.print("NO");
      	}
      }     
    }
}