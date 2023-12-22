import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // get value from StandardIn
    int prob = sc.nextInt();
    int post = sc.nextInt();
    int accept = 0;
    int wrong = 0;
    int wrongCount[] = new int[prob];
    boolean result[] = new boolean[prob];
    for(int i=0;i<prob;i++){
      result[i] = false;
      wrongCount[i] = 0;
    }

    int num;
    String res;
    for(int i=0;i<post;i++){
      num = sc.nextInt();
      res = sc.next();
      if(result[num-1] == false && res.equals("AC")){
        result[num-1] = true;
        accept++;
        wrong += wrongCount[num-1];
      }else if(result[num-1] == false && res.equals("WA")){
        wrongCount[num-1] ++;
      }
    }

    System.out.println(accept + " " + wrong);
  }
}
