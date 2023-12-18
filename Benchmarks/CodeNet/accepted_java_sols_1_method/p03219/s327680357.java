import java.util.*;
class Main{
public static void main(String[ ] args)
{
 Scanner sc = new Scanner(System.in);
String inputline= sc.nextLine();
String fare[]=inputline.split(" ");

System.out.println(Integer.parseInt(fare[0])+Integer.parseInt(fare[1])/2);
}

}