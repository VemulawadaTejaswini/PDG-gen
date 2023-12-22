import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text,Line;
        int count[] = new int[26];
        int z;
        StringBuilder sb = new StringBuilder();
        while(sc.hasNextLine())
        {
           sb.append(sc.nextLine().toLowerCase());  
        }
        int toAscii[] =new int [sb.length()];
        
       
        for(int i =0; i<sb.length();i++)
        {
            z=0;
            toAscii[i] =(int) sb.charAt(i);
            if(97<=toAscii[i] && toAscii[i]<=122)
            {
                z = toAscii[i] - 97;
                count[z] =count[z]+1;
            }
        }
        for(int i = 0; i<26;i++)
        {
            z = i+97;
            char a = (char) z;
            System.out.println(a+ " : "+count[i]);
        }
    }
}
