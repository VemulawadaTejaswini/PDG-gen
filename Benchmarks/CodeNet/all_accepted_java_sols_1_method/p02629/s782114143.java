import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long N = sc.nextLong();
        StringBuilder ans = new StringBuilder();
       while(N > 0){
        long kari =  N % 26l;
          if(kari == 0) kari = 26;
          char alp = (char) (96 + kari);
          ans.append(alp);
         N -= 1;
         N /= 26l;
       }
      ans.reverse();
      System.out.println(ans.toString());
    } 
}