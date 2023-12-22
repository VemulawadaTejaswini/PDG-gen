import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word;
        String[] sen = new String[1000];
        int i=0;
        word = scan.next();
        while(true){
            sen[i] = scan.next();
            if(sen[i].equals("END_OF_TEXT"))break;
            i++; 
        }
        int ans=0;
        int num=word.length();;
        for(int j=0;j<i+1;j++){
            if(sen[j].equalsIgnoreCase(word))ans++;
        }
        System.out.println(ans);
        return;
    }
}
