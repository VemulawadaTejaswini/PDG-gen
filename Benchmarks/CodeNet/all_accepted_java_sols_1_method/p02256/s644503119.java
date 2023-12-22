import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    while(true){
	if(b>a){
	    int tmp=b;
	    b=a;
	    a=tmp;
	}
	if(a%b==0){
	    System.out.println(b);
	    break;
	}
	else{
	    a=a%b;
	}
    }
  }
}

