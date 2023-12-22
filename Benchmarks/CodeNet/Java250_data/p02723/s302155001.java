import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        int i=0;
        String st=tan.next();
        char []c=new char[st.length()];
        for(char ch : st.toCharArray()){
            c[i]=ch;
            i++;
        }
        if(c[2]==c[3] && c[4]==c[5])
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}
