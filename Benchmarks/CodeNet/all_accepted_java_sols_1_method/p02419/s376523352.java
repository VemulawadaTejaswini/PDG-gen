import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N=0;
    String Word =scanner.nextLine();
    String Sentence;

    do{
      Sentence =scanner.next();
      if(Word.equals(Sentence.toLowerCase())){
        N++;
      }
    }while(!(Sentence.equals("END_OF_TEXT")));

    System.out.println(N);


  }
}

