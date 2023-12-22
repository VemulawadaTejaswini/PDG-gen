import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    String firstline = scanner.nextLine();
    String secondline = scanner.nextLine();
    String thirdline = scanner.nextLine();
    
    String fl[] = firstline.split("\\s");
    String sl[] = secondline.split("\\s");
    String tl[] = thirdline.split("\\s");
    
    int N = Integer.parseInt(fl[0]);
    int j;
    int c;
    int max = 0;
    for(int i = 0; i < N; i++){
      j = Integer.parseInt(sl[i]);
      c = Integer.parseInt(tl[i]);
      if(j > c){
        max += j - c;
      }
    }
    System.out.println(max);
  }
}