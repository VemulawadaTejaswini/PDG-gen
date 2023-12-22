import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String b = sc.next();
      if(b.contains("A")){
        System.out.println(b.replace("A","T"));
      }if(b.contains("T")){
        System.out.println(b.replace("T","A"));
      }if(b.contains("C")){
        System.out.println(b.replace("C","G"));
      }if(b.contains("G")){
        System.out.println(b.replace("G","C"));
      }
    }
}