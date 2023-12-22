import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int y=sc.nextInt();
  boolean v=false;
  if(x==0&&y==0){
System.out.println("Yes");
  }else{
  for(int i=0;i<=x;i++){
		int c=i*2+(x-i)*4;
  
    if(y!=0&&(c==y)){
      v=true;
      System.out.println("Yes");
      break;
    }
  }
    
  
  if(v==false){
System.out.println("No");
  }
  }
}
}