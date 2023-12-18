import java.util.*;

class Main{
	int a,b;

  public static void main(String[] ar){
    new Main();
  }
  public Main(){
  	Scanner sc=new Scanner(System.in);
  	String line=sc.nextLine();
    String[] elestr=line.split(" ");
  	a=Integer.parseInt(elestr[0]);
    b=Integer.parseInt(elestr[1]);	
  	int x[]=new int[3];
    x[0]=a+b; x[1]=a-b; x[2]=a*b;
    Arrays.sort(x);

    System.out.println(x[2]);
  }
}