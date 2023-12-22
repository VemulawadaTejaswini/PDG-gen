import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();s.nextLine();
      char[] ss=s.nextLine().toCharArray();
      int res=0;
      for(int i=0;i<=999;i++){
      	int d1=i%10,d2=(i/10)%10,d3=i/100;
      	int[] d=new int[]{d1,d2,d3};
      	int p=0;
      	for(int j=0;j<n;j++){
      		if(p>2){break;}
      		if(ss[j]-'0'==d[p]){
      			p++;
      		}
      	}
      	if(p>2){res++;}

      }
      	System.out.println(res);
      }
        }
    
