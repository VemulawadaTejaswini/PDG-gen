import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
       Scanner ob=new Scanner(System.in);
       int n=ob.nextInt();
       char[] s=ob.next().toCharArray();
       int count=0;
       int  i=0,j=s.length-1;
for(;i<j;)
{
if(s[i]=='R'){++i;continue;}
if(s[j]=='W'){--j;continue;}
if(s[i]!=s[j]){
char temp=s[i];
s[i]=s[j];
s[j]=temp;
count++;
}
}
/*for(int k=0;k<s.length;k++){
    System.out.print(s[k]);
}*/
    System.out.println(count);
     } 
}