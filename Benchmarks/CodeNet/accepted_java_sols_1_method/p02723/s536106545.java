import java.util.Scanner;
public class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String list[] = sc.next().split("");
      if(list[2].equals(list[3]) && list[4].equals(list[5])){
        System.out.print("Yes");
      }else{
        System.out.print("No");
      }
    }
}