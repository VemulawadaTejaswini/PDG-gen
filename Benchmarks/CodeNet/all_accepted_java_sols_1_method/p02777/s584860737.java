
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.next();
        String t= in.next();
        int s1=in.nextInt();
        int s2=in.nextInt();
        String u=in.next();
        if(u.equals(s)){
            s1--;

        }else{
            s2--;
        }
        System.out.println(s1 + " " + s2);
    }
}
