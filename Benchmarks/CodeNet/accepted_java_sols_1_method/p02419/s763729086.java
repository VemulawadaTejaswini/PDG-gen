import java.util.Scanner;
  
class Main{
  public static void main(String[] arg){

    int count = 0;
    
    Scanner in = new Scanner(System.in);

    String w = in.nextLine();
    w = w.toLowerCase();

    while(true){
        String t = in.nextLine();

        if(t.equals("END_OF_TEXT")) break;

        t = t.toLowerCase();
        String [] words = t.split(" ",0);

        for(int i=0; i<words.length; i++)
            if(w.equals(words[i]))
                count++;
    }

    System.out.println(count);

  }
}