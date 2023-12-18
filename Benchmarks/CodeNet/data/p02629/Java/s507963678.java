import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        String s="";
        while(n!=0)
        {
            long p1= n%26;
            int p=(int)p1 + 96;
            if(p==96){
                s="a"+s;
            }
            else{
                String str =new Character((char)p).toString();
                s=str+s;
                
            }
            n=n/26;
        }
        System.out.println(s);
    }
}