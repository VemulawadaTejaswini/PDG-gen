import java.util.*; 
class Main 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in); 
int n = Integer.parseInt(sc.nextLine()); 
String s = sc.nextLine(); 
int l= s.length(); 
if(l<=n) 
{
System.out.print(s);
} 
else 
{ 
System.out.print((s.substring(0,n))+"...");    
}
} 
}