import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
	int flag=N%10;
    
    if(flag==3) System.out.println("bon");
    else if (flag==0||flag==1||flag==6||flag==8) System.out.println("pon");
    else System.out.println("hon");
  }  
}