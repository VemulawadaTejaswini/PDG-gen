import java.io.*;
import java.util.*;
class Main{
public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	char[] a = in.next().toCharArray();
  	char[] b = in.next().toCharArray();
  	char[] c = in.next().toCharArray();
  	int i1=0,i2=0,i3=0;
  	char next='a';
  	char winner;
  	while(true){
      	if(next=='a'){
          	if(i1==a.length){
            	System.out.println("A");
              	break;
            }
        	next = a[i1++];
        }
      	else if(next=='b'){
        	if(i2==b.length){
            	System.out.println("B");
              	break;
            }	
          	next = b[i2++];
        }
      	else{
          	if(i3==c.length){
            	System.out.println("C");
              	break;
            }
        	next = c[i3++];
        }
    }
  	
}
}