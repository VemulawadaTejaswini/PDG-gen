import java.util.*;
public class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int len=s.nextInt();
  String string=s.next();
  char[] arr=string.toCharArray();
  for(int j=0;j<arr.length;j++){
  for(int i=0;i<len;i++){
    if(arr[j]=='Z')
      arr[j]='A';
    else
      ++arr[j];
  }
  }
  System.out.println(Arrays.toString(arr).substring(1,3*arr.length-1).replaceAll(", ",""));
}}