import java.util.Scanner;

class Main{
  public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int x = sc.nextInt();

System.out.println((x/3600)":"((x/60)%60)":" (x%60));
}
}



