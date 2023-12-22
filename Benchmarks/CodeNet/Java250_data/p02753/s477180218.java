import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
      	//System.out.println(n);
      	if(n.equals("AAA") || n.equals("BBB")){
          System.out.print("No");
        }else{
          System.out.print("Yes");
        }
    }
}