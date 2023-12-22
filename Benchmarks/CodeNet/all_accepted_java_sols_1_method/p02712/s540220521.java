import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    int number=scanner.nextInt();
    long answer=0;
    for(int i=1;i<=number;i++){
      if(!(i%3==0||i%5==0)){
        answer=answer+i;
      }else{
        continue;
      }
     }
     System.out.println(answer);
  }
}