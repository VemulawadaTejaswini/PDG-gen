import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    long n=obj.nextLong();
    StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            result.insert(0, (char)('a' + n % 26));
            n /= 26;
        }

        System.out.println(result.toString());
  }
}