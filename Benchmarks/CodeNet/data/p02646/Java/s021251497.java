import java.util.*;
class Main{
  	public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
      	int a,v,b,w,t;
      	a=scan.nextInt();
      	v=scan.nextInt();
      	b=scan.nextInt();
      	w=scan.nextInt();
      	t=scan.nextInt();
      	if(v*t+a>=w*t+b){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
    }
}