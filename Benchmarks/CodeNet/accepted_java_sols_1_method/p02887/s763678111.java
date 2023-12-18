import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{

public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
       int n=s.nextInt();s.nextLine();
       char[] arr=s.nextLine().toCharArray();
       int res=0;
       for(int i=0;i<n;i++){
       	while(i+1<n&&arr[i]==arr[i+1]){
       		i++;
       	}
       	res++;
       }
       	
       System.out.println(res); 
    }
}
    
  










