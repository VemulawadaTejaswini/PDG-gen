import java.util.Scanner;
public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        long n=scanner.nextLong();
        String s="";
        while (n>0)
        {
            long i = n%26;
            if(i==0)
            {
                i=26;
            }
            char c= (char) (96+i);
            s+=c;
            if(n/26==1 && n<27)
                n=0;
            else if(n%26==0)
            {
                n=n/26-1;
            }
            else
            {
                n=n/26;
            }
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }

	// write your code here
    }
}
