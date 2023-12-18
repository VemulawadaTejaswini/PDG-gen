//import for Scanner and other utility classes
import java.util.*;
import java.io.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
public class Main {
    public static void main(String args[] ) {
        Scanner s = new Scanner(System.in);
       int n=s.nextInt();
      //int k=s.nextInt();
int a[]=new int[n];
List<Integer>l=new ArrayList<Integer>();
//int c=0;
for(int i=0;i<n;i++){
int t=s.nextInt();
 a[t-1]=i+1;
 
}
for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
      
        // Write your code here
 
    }
}