import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    long X=s.nextLong();
	long year=0;
    long box=100;
    
	for(year=0;box<X;year++){
      box+=(long)(box*0.01);
    }
    System.out.println(year);
  }  
}