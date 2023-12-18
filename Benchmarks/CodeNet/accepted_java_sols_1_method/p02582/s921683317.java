import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
      if(line.equals("SSS")) {
            System.out.println("0");
      } else if (line.equals("RRR")) {
            System.out.println("3");
      } else if (line.equals("SRR")) {
            System.out.println("2");
      } else if (line.equals("RRS")) {
            System.out.println("2");
      } else{
            System.out.println("1");
      }
    }
}