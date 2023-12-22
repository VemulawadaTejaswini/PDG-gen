import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char charArray[]=new char[S.length()];
        for(int i=0;i<S.length();i++)
        {
            if((S.charAt(i)+N)>='A' && (S.charAt(i)+N)<='Z')
            {
                charArray[i]= (char)((int)S.charAt(i)+N) ;
            }
            else if((S.charAt(i)+N)>'Z')
            {
                charArray[i]=(char)(((int)S.charAt(i)+N)-26);
            }
        }
        System.out.println(new String(charArray));
    }
}