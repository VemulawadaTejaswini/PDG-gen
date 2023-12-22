import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();int m=sc.nextInt();
  int count=0;
  for(int i=n;i<=m;i++){
  	String po=i+"";
    if(po.length()%2==0){
    	while(po.length()!=0){
        	if(po.substring(0,1).equals(po.substring(po.length()-1,po.length())))po=po.substring(1,po.length()-1);
          else break;
        }
      if(po.length()==0)count++;
    }
    else{
    while(po.length()!=1){
        	if(po.substring(0,1).equals(po.substring(po.length()-1,po.length())))po=po.substring(1,po.length()-1);
          else break;
        }
      if(po.length()==1)count++;
    }
  }
  System.out.println(count);
}
}