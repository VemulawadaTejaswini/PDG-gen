import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
 Scanner scan=new Scanner(System.in);
 int n=scan.nextInt();
 
 char s[][]={{'.',',','!','?',' '},
             {'a','b','c'},
			 {'d','e','f'},
			 {'g','h','i'},
			 {'j','k','l'},
			 {'m','n','o'},
			 {'p','q','r','s'},
			 {'t','u','v'},
			 {'w','x','y','z'},
			 };
 for(int i=0;i<n;i++)
 {
  String str=scan.next();
  String ans="";
  for(int j=0;j<str.length();j++)
  {
   int count=-1,select=0,waru=3;
   while(str.charAt(j)!='0')
   {
    count++;
	j++;
   }
   if(count==-1)continue;
   select=Integer.parseInt(str.charAt(j-1)+"")-1;
   if(select==0)waru=5;
   if(select==6||select==8)waru=4;
   ans+=s[select][count%waru];
  }
  System.out.println(ans);
 }
 
 }
}