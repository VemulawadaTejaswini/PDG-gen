import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str;

        while(true){
            str = sc.nextLine();
            if(str.equals(".")) break;
            char [] A;
            A = new char[100];
            A = str.toCharArray();
            char [] c;
            c = new char[100];
            int count=0;
            for(int i=0;i<str.length();i++){
                if(A[i] == '[' || A[i] == ']' || A[i] == '(' || A[i] == ')' ){
                    c[count] = A[i];
                    count++;
                }

            }
            String ans = new String(c);
            for(int i=0;i<50;i++){
                ans = ans.trim();
                ans = ans.replace("()","");
                ans = ans.replace("[]","");
            }
            if(ans.equals("")){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}
