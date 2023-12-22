import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String[]s=sc.next().split("",0);
  int min=0;
  for(int i=1;i<n;i++){
  	if(s[i].equals("E"))min++;
  }
  int now=min;
	for(int i=0;i<n-1;i++){
      int m=now;
    	if(s[i].equals("W"))m++;
      	if(s[i+1].equals("E"))m--;
     	now=m;
       min=Math.min(m,min);
    }
  System.out.println(min);


}

}
