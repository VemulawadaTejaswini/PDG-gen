import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int min;
        int anc = 0;
        for(int i = 0;i < N.length();i++){
            min = (int)N.charAt(i);
          	min -=48;
            anc += min;
        }
        if(anc%9 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
