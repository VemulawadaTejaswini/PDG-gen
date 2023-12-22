import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        String xa = s + s;
        if(xa.contains(p)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

