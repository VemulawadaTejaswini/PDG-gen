import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
  public static void main(String[] args) throws Exception{
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(bf.readLine());
    int a[]=new int[n];
    String input=bf.readLine().trim();
    for(int i=0;i<input.length();i++){
a[i]=input.charAt(i);
    }
    int k=Integer.parseInt(bf.readLine());
    int res=0;
    for(int i=0;i<k;i++){
int c=Integer.parseInt(bf.readLine());
      int rep=Integer.parseInt(bf.readLine());
      help(a,c,rep);
      for(int j=0;j<a.length;j++){
res+=a[j];
      
    }
      System.out.println(res);
      res=0;
  }
  }
    
 static void help(int arr[],int prev,int fill){
		for(int i=0;i<arr.length;i++){
if(arr[i]==prev){
arr[i]=fill;
}
        }
 }
}
