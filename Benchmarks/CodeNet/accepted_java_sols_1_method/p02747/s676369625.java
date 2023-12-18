import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        //System.out.print(S);
        if(S.equals("hi")||S.equals("hihi")||S.equals("hihihi")||S.equals("hihihihi")||S.equals("hihihihihi")){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }    
}