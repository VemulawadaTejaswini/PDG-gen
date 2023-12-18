import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long N = sc.nextLong();
        StringBuilder ans = new StringBuilder();
       while(N > 0){
        int kari = (int) N % 26;
          if(kari == 0) kari = 26;
          char alp = (char) (96 + kari);
          ans.append(alp);
         N /= 26l;
         if(kari == 26l ) N -= 1;
       }
      ans.reverse();
      System.out.println(ans.toString());
    } 
}