import java.util.Scanner;
  
class Main{
  public static void main(String[] arg){
    String input;
    int [] count = new int[26];
 
    Scanner in = new Scanner(System.in);

    while(in.hasNext()){
        input = in.nextLine();
        String tmp = input.toLowerCase();

        for(int i=0; i<tmp.length(); i++){
            
            int ch = tmp.charAt(i);
            if(Character.isAlphabetic(ch)){
                // debug int index = ch - 'a';
                // debug System.out.println(index);
                count[ch-'a']++;
            }
        }
    }

    for(int i=0; i<count.length; i++){

        int ch = 'a' + i;
        System.out.printf("%c : %d\n", ch, count[i]);
    }
  }
}