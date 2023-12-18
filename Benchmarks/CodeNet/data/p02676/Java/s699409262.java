import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);   
    int n=obj.nextInt();
    int i;
    String s=obj.nextLine();
   	String str="";
   	char a[]=s.toCharArray();
    for(i=0;i<a.length;i++)
    {
        if(i==n-1)
        {
            str=str+"...";
            break;
        }
        else
        {
            str+=a[i];
        }
    }
    System.out.print(str);
    
}
}