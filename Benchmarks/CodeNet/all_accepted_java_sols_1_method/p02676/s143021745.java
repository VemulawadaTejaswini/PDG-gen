import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        int n,i=0,l;
        n = tan.nextInt();
        String st=tan.next();
        l=st.length();
        for(char c : st.toCharArray()){i++;
            System.out.print(c);
            if(i==n)
                break;
        }
        if(l>n)
            System.out.println("...");
        else
            System.out.println();
    }
}
