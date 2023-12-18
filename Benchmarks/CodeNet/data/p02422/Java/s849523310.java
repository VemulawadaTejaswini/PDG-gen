
import java.util.Scanner;

class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int n = sc.nextInt();
        int a, b;
        for(int i = 0; i<n; i++)
        {
            String str = sc.next();
            a = sc.nextInt();
            b = sc.nextInt();
            if(str.compareTo("replace")==0) sb = sb.replace(a, b+1, sc.next());
            else if (str.compareTo("reverse")==0)
            {
                if(a==0 && b==sb.length()) sb = sb.reverse();
                else
                {    while(true)
                    {
                        if(a>=b)break;
                        else
                        {
                            char temp = sb.charAt(a);
                            sb = sb.deleteCharAt(a);
                            sb = sb.insert(a, sb.charAt(b-1));//b-1 since, 1 char is deleted. 
                            sb = sb.deleteCharAt(b);
                            sb = sb.insert(b, temp);
                            a++; b--;
                        }
                    }
                } 
            }
            else
            {
                char arr[] = sb.toString().toCharArray();
                for(int c=a; c<=b;c++) 
                {
                    System.out.print(arr[c]);
                }
                System.out.println();
            }
          
        }
    }
}
