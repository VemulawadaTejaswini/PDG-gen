import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String s=sc.next();
       String t[]=s.split("");
       int total=700;
       for(int i=0;i<3;i++) {
    	   if(t[i].equals("o")) total+=100;
       }
        System.out.println(total);
    }
}