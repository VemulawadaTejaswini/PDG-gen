import java.util.Scanner;
public class Main{
    public static void Print(int a, int b, String str){
        if(b != str.length()-1)
            System.out.println(str.substring(a,b+1));
        else
            System.out.println(str.substring(a));
    }
    public static String Reverse(int a, int b, String str){
        char[] s1 = str.toCharArray();
	char s2[] = new char[b-a+1];
	for(int i = 0 ; i < b-a+1 ; i++)
		s2[i] = s1[a+i];
	for(int i = 0 ; i < b-a+1 ; i++)
		s1[a+i] = s2[b-a-i];
	String newstr = new String(s1);
	return newstr;
    }
    public static String Replace(int a, int b, String p, String str){
        char[] s1 = str.toCharArray();
	char[] s2 = p.toCharArray();
	for(int i = 0 ; i < s2.length ; i++)
		s1[a + i] = s2[i];
	String newstr = new String(s1);
	return newstr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++)
        {
            String order = sc.next();
            if(order.equals("print"))
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                Print(a,b,str);
            }
            else if(order.equals("reverse"))
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                str = Reverse(a,b,str);
            }
            else
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                String p = sc.next();
                str = Replace(a,b,p,str);
            }
        }
    }
}
