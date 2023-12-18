import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String res="";
        if(a.charAt(a.length()-1)=='s')
        {
           res = a+"es";
        }
        else 
        {
            res = a+"s";
        }
        System.out.println(res);
    }
}