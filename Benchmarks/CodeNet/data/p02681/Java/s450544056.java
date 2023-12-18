import java.util.*; 
class Main 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in); 
String s1 = sc.nextLine(); 
String s2 = sc.nextLine(); 
int l1=s1.length(); 
int l2 =s2.length(); 
  
if(l1==(l2+1)) 
{ 
int count=0;  
for(int i=0;i<l1;i++) 
{
if(s1.charAt(i)!=s2.charAt(i)) 
{
    count++;
}  
} 
if(count==0) 
{
System.out.print("Yes");
} 
else 
{
System.out.println("No");
}  
}  
else 
{
System.out.println("No");
}

}  
}