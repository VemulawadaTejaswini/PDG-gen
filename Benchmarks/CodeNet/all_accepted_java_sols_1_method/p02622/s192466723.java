import java.util.*;
class Main
{
    public static void main(String args[]) {
        String s1,s2;
        int count=0;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}