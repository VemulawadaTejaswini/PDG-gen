import java.util.*;
import java.io.*;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  for(;;){
  String n1=sc.next();
  String n2=sc.next();
  if(n1.equals("0"))break;
  char m1[]=n1.toCharArray();
  char m2[]=n2.toCharArray();
  
  int h=0; int blo=0;
  for(int i=0; i<4; i++)if(m1[i]==m2[i])h++;
  for(int i=0; i<4; i++){
	  for(int j=0;j<4; j++){
		  if(m1[i]==m2[j])blo++;
	  }
  }
System.out.print(h+" ");
System.out.println(blo-h);
  }
    }
}