import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
char[] s=sc.next().toCharArray();
  char[] t=sc.next().toCharArray();
  int min=1000000;
  for(int i=0;i<s.length-t.length+1;i++){
    int a=0;
    for(int j=0;j<t.length;j++){
    	if(s[i+j]==t[j])a++;
    }
    min=Math.min(min,t.length-a);
  }System.out.println(min);
}
}