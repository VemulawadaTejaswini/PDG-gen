import java.util.Scanner;

class Main{

    public static void main(String[] args) {
 
        int n1,n2,n3;
        String str1,str2,str3;
 
		Scanner in = new Scanner(System.in);
 
        str1 = in.next();
        str2 = in.next();
        str3 = in.next();
 
        n1 = Integer.parseInt(str1);
        n2 = Integer.parseInt(str2);
        n3 = Integer.parseInt(str3);
        
        if(n1 < n2 && n2 < n3) System.out.println("Yes");
        else System.out.println("No");
 
        in.close();
    }
}