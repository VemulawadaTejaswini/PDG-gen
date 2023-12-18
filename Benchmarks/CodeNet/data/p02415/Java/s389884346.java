import java.util.Scanner;
class Main
{
   public static void main(String[] args)
      {
             Scanner sc = new Scanner(System.in);
        String s;
        int len=0;
        int i;
        char[] c = new char[1200];
        s = sc.nextLine();
        len += s.length();
        c = s.toCharArray();
        for(i=0;i<len;i++){
        if('a'<=c[i]&&c[i]<='z') c[i] -= 32;
        else if('A'<=c[i]&&c[i]<='Z') c[i]+= 32;
        System.out.print(c[i]);
        }
        System.out.println();
}
}

