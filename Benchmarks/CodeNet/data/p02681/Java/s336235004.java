import java.io.*;
import java.util.*;

class contest{
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	String str1 = s.nextLine();
      	String str2 = s.nextLine();
      
      	char arr1[] = str1.toCharArray();
       	char arr2[] = str2.toCharArray();
      	
      
      	int i;
      	for(i=0;i<arr1.length;i++){
        	if(arr1[i]!=arr2[i]){
            	break;
            }
        }
      	if(i==arr1.length){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}