import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        if(c[2]==c[3]&&c[4]==c[5]){
            System.out.println("Yes");
        }
        else System.out.println("No");


    }
}