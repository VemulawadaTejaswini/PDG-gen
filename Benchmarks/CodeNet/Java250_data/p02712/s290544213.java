import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  long t=sc.nextLong();
  long total=0;
 for(long i=0;i<=t;i++){
  	if(i%3==0 || i%5==0){
    continue;
    }
    else{
    total+=i;
    }
  }
  System.out.println(total);
}
}
