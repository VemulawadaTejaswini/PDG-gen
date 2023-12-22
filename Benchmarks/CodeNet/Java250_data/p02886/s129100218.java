import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{

public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
       int n=s.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){arr[i]=s.nextInt();}
       	int res=0;
       for(int i=0;i<n;i++){
       	for(int j=i+1;j<n;j++){
       		res+=arr[i]*arr[j];
       	}
       }
       System.out.println(res); 
    }
}
    
  










