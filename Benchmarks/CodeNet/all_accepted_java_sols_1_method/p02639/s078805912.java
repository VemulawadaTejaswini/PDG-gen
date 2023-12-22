import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
class Main{
	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int a[]=new int[5];
              int ans=0;
              for(int i=0;i<5;i++){
                  a[i]=in.nextInt();
              }
              for(int i=0;i<5;i++){
                  if(a[i]==0){
                      ans=i+1;
                  }
              }
              System.out.println(ans);
          }
      } 