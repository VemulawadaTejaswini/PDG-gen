import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        String s = sc.next();
        s = s.replaceAll("B","");
        int R = s.length();
        if(all - R >= R || all-R == 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }
}