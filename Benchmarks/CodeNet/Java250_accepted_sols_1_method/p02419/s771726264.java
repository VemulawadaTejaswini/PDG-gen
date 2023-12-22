import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        String word=sc.nextLine();
        word=word.toLowerCase();
        String sent="";
        while(sc.hasNext()){
            sent=sc.next();
            if(sent.equals("END_OF_TEXT")) break;
            sent=sent.toLowerCase();
            if(sent.equals(word))
                count++;
        }
        System.out.println(count);
    }
}
