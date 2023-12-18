import java.util.*; 
class Main 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in); 
int n = Integer.parseInt(sc.nextLine()); 
int t = Integer.parseInt(sc.nextLine());

if(n*4>=t && t%2==0)
{
System.out.println("Yes");
}
else 
{
System.out.println("No");
}

} 
}